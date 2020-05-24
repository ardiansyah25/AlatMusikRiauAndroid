package com.example.alatmusikriau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

private lateinit var rvInstrument:RecyclerView
private var list: ArrayList<Instrument> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvInstrument = findViewById(R.id.rv_instrument)
        rvInstrument.setHasFixedSize(true)
        list.addAll(DataInstrument.listData)
        showRecyclerCardView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_atas, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){
            R.id.menu_about -> {
                startActivity(Intent(this@MainActivity,ActivityAbout::class.java))
            }
        }
    }


    private fun showRecyclerCardView(){
          rvInstrument.layoutManager = LinearLayoutManager(this)
          val cardViewAdaptor = CardViewAdaptor(list)
          rvInstrument.adapter = cardViewAdaptor

        cardViewAdaptor.setOnItemClickCallback(object : CardViewAdaptor.OnItemClickCallback{
            override fun onItemClicked(data: Instrument) {
              showDetail(data)
            }
        })

    }

    private fun showDetail(instrument: Instrument){

//        println(instrument.photo)

        val moveIntent = Intent(this@MainActivity, ActivityDetail::class.java)
        moveIntent.putExtra(ActivityDetail.NAME_INSTRUMENT, instrument.name )
        moveIntent.putExtra(ActivityDetail.DETAIL_INSTRUMENT, instrument.detail )
        moveIntent.putExtra(ActivityDetail.PHOTO_INSTRUMENT, instrument.photo )
        startActivity(moveIntent)
    }
}
