package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), Callback {
    private lateinit var batu1: ImageView
    private lateinit var batu2: ImageView
    private lateinit var kt1: ImageView
    private lateinit var kt2: ImageView
    private lateinit var gt1: ImageView
    private lateinit var gt2: ImageView
    private lateinit var refresh: ImageView
    private lateinit var imageStatus: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batu1 = findViewById(R.id.batu1)
        batu2 = findViewById(R.id.batu2)
        kt1 = findViewById(R.id.kt1)
        kt2 = findViewById(R.id.kt2)
        gt1 = findViewById(R.id.gt1)
        gt2 = findViewById(R.id.gt2)
        refresh = findViewById(R.id.refresh)
        imageStatus = findViewById(R.id.status)
        val controller = Controller(this)


        val btn = mutableListOf(batu1, kt1, gt1)
        btn.forEach {
            batu1.setOnClickListener {
                val data = mutableListOf("Batu", "Kertas", "Gunting")
                val indext = (0..2).random()
                /*Toast.makeText(this, data[indext], Toast.LENGTH_SHORT).show()*/
                batu1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                batu1.background = (ContextCompat.getDrawable(this, R.drawable.select))

                kt1.setBackgroundResource(R.drawable.kertas)
                gt1.setBackgroundResource(R.drawable.gunting)

                when (indext) {

                    0 -> {
                        batu2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        batu2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))

                        kt2.setBackgroundResource(R.drawable.kertas)
                        gt2.setBackgroundResource(R.drawable.gunting)

                        controller.bandingkanNumbers(0, 0)
                    }
                    1 -> {
                        kt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        kt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        gt2.setBackgroundResource(R.drawable.gunting)
                        controller.bandingkanNumbers(0, 1)
                    }
                    2 -> {
                        gt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        gt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        kt2.setBackgroundResource(R.drawable.kertas)
                        controller.bandingkanNumbers(0, 2)
                    }
                }
            }

            kt1.setOnClickListener {
                val data = mutableListOf("Batu", "Kertas", "Gunting")
                val indext = (0..2).random()
                batu1.setBackgroundResource(R.drawable.batu)

                kt1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                kt1.background = (ContextCompat.getDrawable(this, R.drawable.select))
                gt1.setBackgroundResource(R.drawable.gunting)

                when (indext) {

                    0 -> {
                        batu2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        batu2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))

                        kt2.setBackgroundResource(R.drawable.kertas)
                        gt2.setBackgroundResource(R.drawable.gunting)
                        controller.bandingkanNumbers(1, 0)
                    }
                    1 -> {
                        kt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        kt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        gt2.setBackgroundResource(R.drawable.gunting)
                        controller.bandingkanNumbers(1, 1)
                    }
                    2 -> {
                        gt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        gt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        kt2.setBackgroundResource(R.drawable.kertas)
                        controller.bandingkanNumbers(1, 2)
                    }
                }
            }

            gt1.setOnClickListener {
                val data = mutableListOf("Batu", "Kertas", "Gunting")
                val indext = (0..2).random()
                batu1.setBackgroundResource(R.drawable.batu)
                kt1.setBackgroundResource(R.drawable.kertas)
                gt1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                gt1.background = (ContextCompat.getDrawable(this, R.drawable.select))
                when (indext) {

                    0 -> {
                        batu2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                        batu2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))

                        kt2.setBackgroundResource(R.drawable.kertas)
                        gt2.setBackgroundResource(R.drawable.gunting)

                        controller.bandingkanNumbers(2, 0)
                    }
                    1 -> {
                        kt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                        kt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        gt2.setBackgroundResource(R.drawable.gunting)

                        controller.bandingkanNumbers(2, 1)
                    }
                    2 -> {
                        gt2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                        gt2.background =
                            (ContextCompat.getDrawable(this, R.drawable.select))
                        batu2.setBackgroundResource(R.drawable.batu)
                        kt2.setBackgroundResource(R.drawable.kertas)
                        controller.bandingkanNumbers(2, 2)
                    }
                }
            }
        }

        refresh.setOnClickListener {
            batu1.setBackgroundResource(R.drawable.batu)
            kt1.setBackgroundResource(R.drawable.kertas)
            gt1.setBackgroundResource(R.drawable.gunting)
            imageStatus.setBackgroundResource(R.drawable.vs)
            batu2.setBackgroundResource(R.drawable.batu)
            kt2.setBackgroundResource(R.drawable.kertas)
            gt2.setBackgroundResource(R.drawable.gunting)

        }
    }

    override fun kirimStatus(status: String) {
        when {
            status.contains("1") -> {
                imageStatus.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.p1menang
                    )
                ) // src
                imageStatus.background =
                    (ContextCompat.getDrawable(this, R.drawable.p1menang)) // background
            }
            status.contains("2") -> {
                imageStatus.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.p2menang
                    )
                ) // src
                imageStatus.background =
                    (ContextCompat.getDrawable(this, R.drawable.p2menang))
            }
            status.contains("w") -> {
                imageStatus.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.draw
                    )
                ) // src
                imageStatus.background =
                    (ContextCompat.getDrawable(this, R.drawable.draw))
            }
        }
    }
}