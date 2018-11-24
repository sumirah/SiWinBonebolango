package com.sumirah.siwinbonebolango.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sumirah.siwinbonebolango.R
import com.sumirah.siwinbonebolango.api.ApiRepository
import com.sumirah.siwinbonebolango.api.SPBEDBApi
import com.sumirah.siwinbonebolango.detail.ProfilDetailActivity
import com.sumirah.siwinbonebolango.model.Profil
import kotlinx.android.synthetic.main.fragment_profil.*
import org.jetbrains.anko.support.v4.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfilFragment:Fragment(){

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_profil, container, false)
        }

        private var service: Call<MutableList<Profil>>? = null


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            service = ApiRepository.retrofit.create(SPBEDBApi::class.java).getProfil()
            service?.enqueue(object : Callback<MutableList<Profil>> {
                override fun onFailure(call: Call<MutableList<Profil>>, t: Throwable) {
                    Log.e("ERROR_RESPONSE", t.message)
                }

                override fun onResponse(call: Call<MutableList<Profil>>, response: Response<MutableList<Profil>>) {
                    response.body()?.let { initRecyclerView(it) }
                }

            })
        }

        //KLIK PAKAI MATCH OBJECT

        private fun initRecyclerView(list: MutableList<Profil>) {
            rv_profil.layoutManager = LinearLayoutManager(context)
            val adapter = ProfilRecyclerViewAdapter(list) { profil ->
                startActivity<ProfilDetailActivity>( "MATCH_OBJECT" to profil
//                "KODE_INSTANSI" to it.kodeInstansi,
//                "KODE _KATEGORI" to it.kodeKategori,
//                "KODE_APLIKASI" to it.kodeAplikasi
                )
            }
            rv_profil.adapter = adapter
        }


        //STOP LOADING DATA SAAT PINDAH MENU
        override fun onDestroyView() {
            super.onDestroyView()

            if (service?.isExecuted == true) {
                service?.cancel()
            }
        }




}