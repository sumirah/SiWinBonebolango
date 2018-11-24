package com.sumirah.siwinbonebolango.model

import com.google.gson.annotations.SerializedName

data class SpbeResponses(
    @SerializedName("spbes") var spbes: MutableList<Spbe>)
