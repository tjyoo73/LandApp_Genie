package com.tjlab.landapp_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.landapp_genie.databinding.ActivityViewRoomDetailBinding
import com.tjlab.landapp_genie.datas.Room

class ViewRoomDetail : AppCompatActivity() {

    lateinit var binding : ActivityViewRoomDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewRoomDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val roomData = intent.getSerializableExtra("room") as Room
        binding.priceTxt.text = roomData.getFormattedPrice()
        binding.descriptionTxt.text = roomData.description
        binding.addressTxt.text = roomData.address
        binding.floorTxt.text = roomData.getFormattedFloor()
    }
}