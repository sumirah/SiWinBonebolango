package com.sumirah.siwinbonebolango.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Spbe(
    @SerializedName("kode_aplikasi")
    var AplikasiId: String? = null,

    @SerializedName("kode_instansi")
    var kodeInstansi: String? = null,

    @SerializedName("nama_instansi")
    var namaInstansi: String? = null,

    @SerializedName("kode_kategori")
    var kodeKategori: String? = null,

    @SerializedName("kategori")
    var jenisKategori: String? = null,

    @SerializedName("nama_aplikasi")
    var namaAplikasi: String? = null,

    @SerializedName("link_aplikasi")
    var linkAplikasi: String? = null,

    @SerializedName("deskripsi")
    var deskripsiAplikasi: String? = null
) : Parcelable
