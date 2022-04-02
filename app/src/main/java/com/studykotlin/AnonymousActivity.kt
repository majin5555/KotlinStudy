package com.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.wlsk.utils.LogUtils
import com.R



//TODO 匿名函数
class AnonymousActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anonymous)
        var count = "setContentView(R.layout.activity_anonymous)".count();
        LogUtils.d("count:$count")
        //TvCount.text = count.toString()

        //匿名函数 最后一行就是返回值
        val methodAction: () -> String = {
            "123456789"
        }
        LogUtils.d(methodAction())


        val methondAction1: (Int, Int, Int) -> String = { number1, number2, number3 ->
            val count = 9999
            "count $count     number$number1   number2$number2  mumber3 $number3"
        }

        LogUtils.d(methondAction1(1, 2, 3))


        //TODO kotlin语言的It关键字特点

        var name: String = "123456"
        val substring = name.substring(1, 5)
        LogUtils.d(substring)


        val sourcepwd = "aqwertyuiopasdfghjklzxcvbnm"

        sourcepwd.apply {

        }

        sourcepwd.let {

        }

        var jiajia: String = "佳佳"

        String(charArrayOf('1'))

    }


}

open class Person(var name: String, var age: Int) {


}

class Student(name: String, age: Int, var score: Int) : Person(name, age) {

}

interface MyInterface {
    var name: String;
}

class MyImpl : MyInterface {
    override var name: String = "runoob"
}