package com.carlostena.discrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.carlostena.discrollview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //FORMA1
    /*lateinit var imageViewPueblo : ImageView
    lateinit var tvSeries : TextView
    lateinit var hsvSeries : HorizontalScrollView*/

    //FORMA2

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView((binding.root))
        binding.elpueblo.setOnClickListener {
            saludaAmazon()}

        binding.series.visibility=View.GONE

        binding.tvSeries?.setOnClickListener {
            if(binding.series.visibility==View.VISIBLE)
                binding.series.visibility=View.GONE
            else
                binding.series.visibility=View.VISIBLE
        }



        //FORMA1
        /*setContentView(R.layout.activity_main)
        imageViewPueblo=findViewById(R.id.elpueblo)
        imageViewPueblo.setOnClickListener {
            saludaAmazon()
        }
        hsvSeries=findViewById(R.id.series)
        hsvSeries.visibility= View.GONE
        tvSeries=findViewById(R.id.tvSeries)

        tvSeries.setOnClickListener {
            if(hsvSeries.visibility==View.VISIBLE)
                hsvSeries.visibility=View.GONE
            else
                hsvSeries.visibility=View.VISIBLE
        }
    }*/


    }
        fun saludaAmazon() {
            Toast.makeText(this, "Hola amazon", Toast.LENGTH_LONG).show()
        }

}