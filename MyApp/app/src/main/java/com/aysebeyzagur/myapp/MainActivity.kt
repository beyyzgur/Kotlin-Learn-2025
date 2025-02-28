package com.aysebeyzagur.myapp

import android.os.Bundle
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //println("hello")
        //println(4*5)

        println("-------Variables-------")

        //Variables
        var x = 20
        var y = 2
        val result = x*y
         println(result)

        //Constants
        val beyza = 20
        //beyza = 18    gave error


        //Defining(Tanımlama)
        var myFirstInt : Int

        // Initializing(Başlatma)
        myFirstInt = 5

        // could be written like
        var myInteger : Int = 10
        myInteger = 5 // if i am gonna say val, then don't change the value after initializing

        val a : Double = 21.0  // size: 64bits , 15 - 16 decimal digits
        println(a/2)
        //or
        val a1 : Float = 23f // size: 32bits , 6 - 7 decimal digits
        println(a1/2)

        //camelCase , generally we use this one.
        //snake_case

        println("------String------")

        var myString : String = "Beyza"
        println(myString)

        var boolean = true
        // or
        var myBoolean : Boolean = false

        println(a>a1)
        println(7 == 7)

        var nu = "7"
        println(nu.toInt())   // Conversion

        println("------Collections------")

        //Collections
        // 1- Arrays

        var myArray = arrayOf("beyzos","emros","bebik1","bebik2")
        println(myArray[2])

        val doubleList = doubleArrayOf(50.5,85.8,99.9)

        val mixedArray = arrayOf("beyza",20,"emre",23)
        println(mixedArray[2])

        val myList = arrayListOf("beyzos",20)
        println(myList[1])

        val myList1 = ArrayList<String>()
        myList1.add("beyzos")
        myList1.add("emros")
        myList1.add(2,"yirmi")
        myList1.add(3,"yirmi uc")
        println(myList1[3])

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("first element : ${myExampleArray[0]}")

        println("------Sets------")

        //An element cannot occur more than once in a Set.

        val mySet = setOf(2,3,4,3)
        println(mySet.size)  // the answer is 4

        val mySet2 = setOf<String>("reyyos","maya","beyzos","ayaz")
        //println(mySet2(3))  could not do it because Sets are
        // an unordered collection type and the items have no specific order.
        val myList2 = mySet2.toList()
        println(myList2[3])
        println(mySet2.size)

        println("------ForEach------")

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        //val myStringSet = hashSetOf<String>("apple","banana","kiwi","orange") is also working
        myStringSet.add("apple")
        myStringSet.add("banana")
        myStringSet.add("kiwi")
        myStringSet.add("orange")
        println(myStringSet.joinToString(" | ", prefix = "Fruits: ", postfix = ", i like them all."))

        println("------Map------")
        //Key - Value

        var fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        val myNewMap = hashMapOf<String,Int>("A" to 1, "B" to 2)
        println(myNewMap["B"])

        println("------Operatorler------")
        //Operatorler

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7
        println(n > m)

        // && and ||
        // remainders .... % (mod alma - kalan bulma)
        println(10%4.0)

        println("------If Control------")

        val myAge = 20

        if(myAge < 18){
            println("alkol tüketmen yasak")
        } else println("alkol tüketmen yasal")

        println("------Switch-When------")
        val month = 2
        var monthString = ""

         when(month)
         {
             1 -> monthString = "January"
             2 -> monthString = "February"
             3 -> monthString = "March"
             4 -> monthString = "April"
             else -> monthString = "not first 4 months"
         }

        println(monthString)

        // Flop Loop - While Loop
        println("------For Loop------")

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        for(number in myArrayOfNumbers){
            val i = number / 3 * 5
            println(i)
        }
         for (i in myArrayOfNumbers.indices) {
             val num = myArrayOfNumbers[i] / 3 * 5
             println(num)
         }

        for (b in 0 .. 9) {
            println(b)
        }


        val myStringArray = ArrayList<String>()
        myStringArray.add("Ayşe")
        myStringArray.add("Osman")
        myStringArray.add("Ömürlü")

        for(str in myStringArray) {
            println(str)
        }

        myStringArray.forEach { println(it) }

        println("------While Loop------")

        var b = 10

        while (b<=20) {
            println(b)
            b++
        }











    }
}