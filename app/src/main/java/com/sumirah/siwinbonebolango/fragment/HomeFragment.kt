package com.sumirah.siwinbonebolango.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.sumirah.siwinbonebolango.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_home, container, false)
    }

    //Memanggil segala sesuatu di fragment harus di onViewCreated (secara bestpractice)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.let {
//            Glide.with(it).load(R.mipmap.ic_launcher).into(logo_home)
            Glide.with(it).load(R.drawable.logo).into(logo_home)
        }
    }

}