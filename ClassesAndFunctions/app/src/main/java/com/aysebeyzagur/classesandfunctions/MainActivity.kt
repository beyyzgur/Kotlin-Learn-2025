package com.aysebeyzagur.classesandfunctions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.internal.Ref.LongRef

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView // onCreate'ten önce bir sey yaptıgımız için late initialize
    //lateinit var myButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        myTextView = findViewById(R.id.textView)
        /*
        myButton = findViewById(R.id.button)

        myButton.setOnClickListener {
            myTextView.text = "Button Clicked 2 babe"
        }
        */
        println("helloo beyza!")
        test()
        println(mySum( 4 ,8))
        myMultiply(24,5)

    }

    fun test () {
        println("test function")
    }
    // functions returns unit by default
    fun mySum ( a : Int , b : Int) : Int { // this func returns Int right now, not Unit. Careful!
        var sum : Int = a + b
        return sum
    }

    fun myMultiply ( x : Int , y : Int ) : Int {

        val result = x * y
        myTextView.text = " Result = ${ result } "

        return result

    }

    fun buttonClicked(view : View) {
        myTextView.text = "Button Clicked"
    }

}