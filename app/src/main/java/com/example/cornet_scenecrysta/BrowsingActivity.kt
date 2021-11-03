package com.example.cornet_scenecrysta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class BrowsingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.browsing_activity)

        val center:    ImageView = findViewById<ImageView>(R.id.image_center) as ImageView
        val top_left:  ImageView = findViewById<ImageView>(R.id.image_top_left) as ImageView
        val top:       ImageView = findViewById<ImageView>(R.id.image_top) as ImageView
        val top_right: ImageView = findViewById<ImageView>(R.id.image_top_right) as ImageView
        val left:      ImageView = findViewById<ImageView>(R.id.image_left) as ImageView
        val right:     ImageView = findViewById<ImageView>(R.id.image_right) as ImageView
        val bottom_left:ImageView= findViewById<ImageView>(R.id.image_bottom_left) as ImageView
        val bottom:    ImageView = findViewById<ImageView>(R.id.image_bottom) as ImageView
        val bottom_right:ImageView=findViewById<ImageView>(R.id.image_bottom_right) as ImageView

        val allImageView = arrayOf(top_left,top,top_right,left,center,right,bottom_left,bottom,bottom_right)
        for(imageview in allImageView){
            imageview.setOnClickListener(listenClicked);imageview.setOnLongClickListener(listenLongClicked)
        }

        val button_config:Button=findViewById<Button>(R.id.button_config)
        button_config.setOnClickListener(listenConfig)
        val button_rebrowse:Button=findViewById<Button>(R.id.button_rebrowse)
        button_rebrowse.setOnClickListener(listenRebrowse)
    }

    private val listenClicked = View.OnClickListener {
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
        true
    }
    private val listenLongClicked = View.OnLongClickListener {
        Toast.makeText(this,"long-clicked",Toast.LENGTH_SHORT).show()
        startActivity(Intent(applicationContext, DetailActivity::class.java))
        true
    }
    private val listenConfig = View.OnClickListener {
        Toast.makeText(this,"config",Toast.LENGTH_SHORT).show()
        startActivity(Intent(applicationContext, ConfigActivity::class.java))
        true
    }
    private val listenRebrowse = View.OnClickListener {
        Toast.makeText(this,"rebrowse",Toast.LENGTH_SHORT).show()
        true
    }

}