package com.example.alatmusikriau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActivityDetail : AppCompatActivity() {

    companion object {
        const val NAME_INSTRUMENT = "name"
        const val DETAIL_INSTRUMENT = "detail"
        const val PHOTO_INSTRUMENT = "photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionbar = supportActionBar
        val tv_name:TextView = findViewById(R.id.tv_instrument_detail_name)
        val tv_detail:TextView = findViewById(R.id.tv_instrument_detail_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_detail_item_photo)

        val name = intent.getStringExtra(NAME_INSTRUMENT)
        val photo = intent.getIntExtra(PHOTO_INSTRUMENT,0)
        val detail = intent.getStringExtra(DETAIL_INSTRUMENT)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(350,550))
            .into(imgPhoto)

        tv_name.text = name
        tv_detail.text = detail

        actionbar!!.title = "Detail Alat Musik"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
       onBackPressed()
        return true
    }
}
