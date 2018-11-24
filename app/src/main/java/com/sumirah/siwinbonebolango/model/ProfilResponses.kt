package com.sumirah.siwinbonebolango.model

import com.google.gson.annotations.SerializedName

data class ProfilResponses(
    @SerializedName("profils") var profils: MutableList<Profil>)