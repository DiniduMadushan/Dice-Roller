package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val roll_btn:Button=findViewById(R.id.roll_btn)
       val ram_num_view:TextView=findViewById(R.id.ran_num)
       val greeting:TextView=findViewById(R.id.greeting)
       val dice_img:ImageView=findViewById(R.id.dice_img)


       roll_btn.setOnClickListener{
                rollDice(dice_img)
       }

    }

    private fun rollDice(dice_img:ImageView){

        val ran_num=Random.nextInt(6)+1
        val drawable_res=when(ran_num){
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5

            else->R.drawable.dice1

        }
        dice_img.setImageResource(drawable_res)
    }

}