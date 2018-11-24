package com.sumirah.siwinbonebolango.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Profil(
    @SerializedName("kode_profil")
    var kodeProfil: String? = null,

    @SerializedName("judul")
    var judulProfil: String? = null,

    @SerializedName("profil")
    var profilDeskripsi: String? = null

) : Parcelable