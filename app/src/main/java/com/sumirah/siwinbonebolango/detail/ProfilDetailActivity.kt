package com.sumirah.siwinbonebolango.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.sumirah.siwinbonebolango.R
import com.sumirah.siwinbonebolango.model.Profil
import kotlinx.android.synthetic.main.activity_profildetail.*

class ProfilDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profildetail)


        Glide.with(this).load(R.drawable.logo).into(logo_detailprofil)


        val profil = intent.getParcelableExtra<Profil>("MATCH_OBJECT")
        txt_judul_profil.text = profil.judulProfil
        txt_deskripsi_profil.text = profil.profilDeskripsi


//            txt_link_aplikasi.setOnClickListener {
//                listener(this)
//            }


//        //Ambil Logo
//        ApiRepository.retrofit
//            .create(SPBEDBApi::class.java)
//            .getSpbeDetailId(spbe.AplikasiId)
//            .enqueue(object : Callback<SpbeDetailResponses> {
//                override fun onFailure(call: Call<SpbeDetailResponses>, t: Throwable) {
//
//                }
//
//                override fun onResponse(call: Call<SpbeDetailResponses>, response: Response<SpbeDetailResponses>) {
//                    val imgUrl = response.body()?.spbes?.get(0)?.teamBadge
//                    Glide.with(this@MatchDetailActivity).load(imgUrl).into(img_detail_club_home_logo)
//                }
//
//            })
//
//        ApiRepository.retrofit.create(TheSportDBApi::class.java)
//            .getClubDetailById(match.awayId)
//            .enqueue(object : Callback<TeamResponses> {
//                override fun onFailure(call: Call<TeamResponses>, t: Throwable) {
//
//                }
//
//                override fun onResponse(call: Call<TeamResponses>, response: Response<TeamResponses>) {
//                    val imgUrl = response.body()?.teams?.get(0)?.teamBadge
//                    Glide.with(this@MatchDetailActivity).load(imgUrl).into(img_detail_club_away_logo)
//                }
//
//            })


        //acton bar
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

    }

    //handle action bar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}


//class SpbeDetailActivity : AppCompatActivity(), SpbeDetailView {
//
//    private lateinit var presenter: SpbeDetailPresenter
//    private lateinit var spbes: Spbe
//    private lateinit var progressBar: ProgressBar
//    private lateinit var swipeRefresh: SwipeRefreshLayout
//
//    //    private lateinit var teamBadge: ImageView
//    private lateinit var namaAplikasi: TextView
//    private lateinit var namaInstansi: TextView
//    //    private lateinit var teamStadium: TextView
//    private lateinit var deskripsiAplikasi: TextView
//
////    private var menuItem: Menu? = null
//
//    private lateinit var id: String
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val intent = intent
//        id = intent.getStringExtra("id")
//        supportActionBar?.title = "Detail Aplikasi"
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        linearLayout {
//            lparams(width = matchParent, height = wrapContent)
//            orientation = LinearLayout.VERTICAL
//            backgroundColor = Color.WHITE
//
//            swipeRefresh = swipeRefreshLayout {
//                setColorSchemeResources(R.color.colorAccent,
//                    android.R.color.holo_green_light,
//                    android.R.color.holo_orange_light,
//                    android.R.color.holo_red_light)
//
//                scrollView {
//                    isVerticalScrollBarEnabled = false
//                    relativeLayout {
//                        lparams(width = matchParent, height = wrapContent)
//
//                        linearLayout{
//                            lparams(width = matchParent, height = wrapContent)
//                            padding = dip(10)
//                            orientation = LinearLayout.VERTICAL
//                            gravity = Gravity.CENTER_HORIZONTAL
//
////                            teamBadge =  imageView {}.lparams(height = dip(75))
//
//                            namaAplikasi = textView{
//                                this.gravity = Gravity.CENTER
//                                textSize = 20f
//                                textColor = resources.getColor(R.color.colorAccent)
//                            }.lparams{
//                                topMargin = dip(5)
//                            }
//
////                            teamFormedYear = textView{
////                                this.gravity = Gravity.CENTER
////                            }
//
////                            teamStadium = textView{
////                                this.gravity = Gravity.CENTER
////                                textColor = resources.getColor(R.color.colorPrimaryText)
////                            }
//
//                            deskripsiAplikasi = textView().lparams{
//                                topMargin = dip(20)
//                            }
//                        }
//                        progressBar = progressBar {
//                        }.lparams {
//                            centerHorizontally()
//                        }
//                    }
//                }
//            }
//        }
//
//
//        val request = ApiRepository()
//        val gson = Gson()
//        presenter = SpbeDetailPresenter(this, request, gson)
//        presenter.getSpbeDetail(id)
//
//        swipeRefresh.onRefresh {
//            presenter.getSpbeDetail(id)
//        }
//    }
//
//
//
//    override fun showLoading() {
//        progressBar.visible()
//    }
//
//    override fun hideLoading() {
//        progressBar.invisible()
//    }
//
//    override fun showSpbeDetail(data: List<Spbe>) {
//        spbes = Spbe(data[0].kodeAplikasi,
//            data[0].namaAplikasi,
//            data[0].namaInstansi)
//        swipeRefresh.isRefreshing = false
////        Picasso.get().load(data[0].teamBadge).into(teamBadge)
//        namaAplikasi.text = data[0].namaAplikasi
//        deskripsiAplikasi.text = data[0].deskripsiAplikasi
////        teamFormedYear.text = data[0].teamFormedYear
////        teamStadium.text = data[0].teamStadium
//
//    }
//
//
//}






//////////////////////////////////////////////











//class SpbeDetailActivity : AppCompatActivity(), SpbeDetailView{
//
//    private lateinit var presenter: SpbeDetailPresenter
//    private var idAplikasi : String? = ""
//    private var spbe : Spbe? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_spbedetail)
//
//        idAplikasi = intent.getStringExtra("KODE_APLIKASI")
////        val idInstansi = intent.getStringExtra("INSTANSI_ID")
////        val idKategori = intent.getStringExtra("KATEGORI_ID")
//
//        presenter = SpbeDetailPresenter(this, this)
//        presenter.getSpbeDetailById(idAplikasi)

//Ambil Logo

//        EspressoIdlingResource.increment()
//        ApiRepository.retrofit
//            .create(TheSportDBApi::class.java)
//            .getClubDetailById(idHome)
//            .enqueue(object : Callback<TeamResponses> {
//                override fun onFailure(call: Call<TeamResponses>, t: Throwable) {
//
//                }
//
//                override fun onResponse(call: Call<TeamResponses>, response: Response<TeamResponses>) {
//                    EspressoIdlingResource.decrement()
//
//                    val imgUrl = response.body()?.teams?.get(0)?.strTeamBadge
//                    Glide.with(this@MatchDetailActivity).load(imgUrl).into(img_detail_club_home_logo)
//                }
//
//            })
//
//        EspressoIdlingResource.increment()
//        ApiRepository.retrofit.create(TheSportDBApi::class.java)
//            .getClubDetailById(idAway)
//            .enqueue(object : Callback<TeamResponses> {
//                override fun onFailure(call: Call<TeamResponses>, t: Throwable) {
//
//                }
//
//                override fun onResponse(call: Call<TeamResponses>, response: Response<TeamResponses>) {
//                    EspressoIdlingResource.decrement()
//
//                    val imgUrl = response.body()?.teams?.get(0)?.strTeamBadge
//                    Glide.with(this@MatchDetailActivity).load(imgUrl).into(img_detail_club_away_logo)
//                }
//
//            })


//        //acton bar
//        val actionbar = supportActionBar
//        actionbar?.setDisplayHomeAsUpEnabled(true)
//
//    }
//
//    override fun initValue(spbe: Spbe){
//        this.spbe = spbe
//
//        txt_nama_aplikasi.text = spbe.namaAplikasi
//        txt_nama_instansi.text = spbe.namaInstansi
//        txt_deskripsi_aplikasi.text = spbe.deskripsiAplikasi
//    }
//
//    //handle action bar
//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }
//
//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        return super.onPrepareOptionsMenu(menu)
//    }
//
//
//
//    override fun showLoading() {
//
//    }
//
//    override fun hideLoading() {
//
//    }
//
//
//
//}