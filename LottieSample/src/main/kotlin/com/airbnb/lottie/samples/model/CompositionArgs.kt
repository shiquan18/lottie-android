package com.airbnb.lottie.samples.model

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class CompositionArgs(
        val assetName: String? = null,
        val url: String? = null,
        val fileUri: Uri? = null,
        val animationData: AnimationData? = null
) : Parcelable