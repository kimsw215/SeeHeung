package kr.ac.kpu.ce2019152012.seeheung.ClassFile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class InfoDataVo(
    val name: String,
    val address1: String,
    val address2: String
    ):Parcelable

