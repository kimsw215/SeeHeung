package kr.ac.kpu.ce2019152012.seeheung.ClassFile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HashDataVo(
    val name: String,
    val tag1: String,
    //val tag2: String,
    val photo: Int
) : Parcelable