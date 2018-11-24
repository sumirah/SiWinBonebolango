package com.sumirah.siwinbonebolango.detail


//class SpbeDetailPresenter(private val view: SpbeDetailView,
//                          private val apiRepository: ApiRepoDua,
//                          private val gson: Gson) {
//
//    fun getSpbeDetail(aplikasiId: String) {
//        view.showLoading()
//
//        async(UI){
//            val data = bg{
//                gson.fromJson(apiRepository
//                    .doRequest(SPBEDBApi(aplikasiId)),
//                    SpbeDetailResponses::class.java
//                )
//            }
//
//            view.showSpbeDetail(data.await().spbes)
//            view.hideLoading()
//        }
//    }
//}

//class SpbeDetailPresenter(private val context: Context?, private val view: SpbeDetailView) {
//    fun getSpbeDetailById(idAplikasi: String?) {
////        EspressoIdlingResource.increment()
//
//        val service = ApiRepository.retrofit.create(SPBEDBApi::class.java).getSpbeDetailById(idAplikasi)
//        service.enqueue(object : Callback<SpbeResponses> {
//            override fun onFailure(call: Call<SpbeResponses>, t: Throwable) {
//
//            }
//
//            override fun onResponse(call: Call<SpbeResponses>, response: Response<SpbeResponses>) {
////                EspressoIdlingResource.decrement()
//
//                response.body()?.spbes?.get(0)?.let { view.initValue(it) }
//            }
//
//        })
//    }
//
//
//
//
//
//
//}

