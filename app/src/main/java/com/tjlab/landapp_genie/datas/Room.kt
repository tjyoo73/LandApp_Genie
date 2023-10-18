package com.tjlab.landapp_genie.datas

import java.text.NumberFormat
import java.util.Locale

class Room(val price: Int,
           val address: String,
           val floor: Int,
           val description: String) {

    fun getFormattedFloor() : String {
        if (this.floor >=1 ) {
            return "${this.floor}층"
        } else if (this.floor == 0) {
            return "반지하"
        } else {
            return "지하 ${-this.floor}층"
        }
    }

    fun getFormattedPrice() : String {
        if (this.price >= 10000) {
            val uk = this.price / 10000
            val rest = this.price % 10000
            //return "${uk}억 ${rest}"
            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }
        else {
            //return "${this.price}"
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"
        }
    }
}