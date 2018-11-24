package com.sumirah.siwinbonebolango.detail

import com.sumirah.siwinbonebolango.model.Spbe

interface SpbeDetailView {
    fun showLoading()
    fun hideLoading()

//    fun initValue(spbe: Spbe)
    fun showSpbeDetail(data: List<Spbe>)
}