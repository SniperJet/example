package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
lateinit var tv: TextView

    var  array = arrayOf(1,2,3,4,5,6,7,8,9,10)
//var x=Random.nextInt(10)
var i =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)

        /** заполянем массив случайными числами
     while (i < array.size) {
             array [i]=Random.nextInt(99)
            i=i+1
             }
*/

       tv.text="  ${array[0]},${array[1]},${array[2]}, ${array[3]},${array[4]}," +
               " ${array[5]},${array[6]},${array[7]}, ${array[8]},${array[9]}"

       /** метод пузырька
        var count=0
        var final=0
while (final < array.size-1 ) {
    while (count < array.size - 1) {
        if (array[count] >= array[count + 1]) {
            var system = 0
            system = array[count + 1]
            array[count + 1] = array[count]
            array[count] = system
            count = count + 1
        } else {
            count = count + 1
        }
    }
    count = 0
    final=final+1

}
**/

        /** метод шейкер
        var count=0
        var final=0
        var limiter=1
        while (final < array.size-1 ) {


            while (count < array.size - 1) {
                if (array[count] >= array[count + 1]) {
                    var system = 0
                    system = array[count + 1]
                    array[count + 1] = array[count]
                    array[count] = system
                    count = count + 1
                } else {
                    count = count + 1
                }
            } //  дотащили число максимально впарво, имеем в count чсило равное длинен массива
            count=count-1
                        while (count>array.size) {
                             if array[count] <= array [count-1] {
                              var system=0
                              system=array[count-1]
                              array [count-1] = array[count]
                              array[count] = system
                        } else {
                count
                            }


            }


            count = 0
            final=final+1

        }
**/
    }

    fun test (view: View) {
    tv.text="  ${array[0]},${array[1]}, ${array[2]}, ${array[3]}, ${array[4]},${array[5]}" +
           "  ${array[6]},${array[7]}, ${array[8]}, ${array[9]} "



    }


}