package com.example.session2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.session2.ui.theme.Session2Theme

fun main(){
    //1.Variables
    val name : String="Denisa"
    val age : Int=20
    println(" Hi $name,$age")

    //2.Null safety
    var b: String?=null
    val l=b?.length ?:-1

    //3.Math
    val i: Double=9.99
    val j: Int=i.toInt()

    //4.Logic
    val code:Int=404

    when(code){
        200 -> println("ok")
        404-> println("not found")
        500-> println("internal server error")
        else -> println("unknown")
    }

    //5.Arrays
    val numbers:IntArray=intArrayOf(1,2,3,4,5)
    for (number in numbers){
        if(number % 2==0)
            println(number)
    }

    //6.Functions
    val result :Int = multiply (4,5)
    println(result)

    //7.Ranges
    for ( i:Int in 10 downTo 1){
        println(i)
    }
    println("Launch!")

    //8.Raw Strings
    val addres="""{"strada": 10,"oras":"Botosani","tara":"Romania"}""".trimIndent()
    println(addres)

    //9.Imumutability
    val city:String="Botosani"
    //city="Iasi" //Error


}
//continuare ex 6,functia multiply

fun multiply(a: Int, b: Int): Int {
      return a * b
  }
//kotlin
