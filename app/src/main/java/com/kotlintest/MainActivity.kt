package cn.wlsk.kotlintest

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import cn.wlsk.utils.LogUtils
import com.R

import java.lang.Exception
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    private val DEBUG = 1
    private val USER = 2

    //返回非空字符串
    fun getName(): String {
        return "返回非Null"
    }

    fun getChildName(): String? {
        var parent: Parent = Child()
        if (parent is Child)
            return parent.getName()
        return null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val basicTypes = BasicTypes() // Kotlin 中没有 new 关键字

        LogUtils.d(basicTypes.aBolean.toString())
        LogUtils.d(basicTypes.anotherBolean.toString())
        LogUtils.d(basicTypes.aInt.toString())
        LogUtils.d(basicTypes.anotherInt.toString())
        LogUtils.d("int 最大值 " + basicTypes.maxInt)//
        LogUtils.d("int 最大值 " + (Math.pow(2.0, 31.0) - 1))
        LogUtils.d("int 最小值 " + basicTypes.minInt)
        LogUtils.d("int 最小值 " + (-Math.pow(2.0, 31.0) - 1))

        val arg1 = 10
        val arg2 = 20
        LogUtils.d("$arg1+$arg2=${arg1 + arg2}")

        //hello "ZhangSan"
        val sayHello: String = "Hello \"ZhangSan\""
        LogUtils.d(sayHello)

        LogUtils.d(getName())

        var parent: Parent = Child()
        if (parent is Child)
            LogUtils.d(parent.getName())

        val string: String? = "Hello"
        if (string != null)
            LogUtils.d(string)

        val p1: Parent = Parent()
        val c1: Child? = p1 as? Child
        //允许返回null
        LogUtils.d(c1.toString())
        var a = A()

        //公共路径
        val publicPath =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                .toString()

        /**
         * 分支表达式
         */
        //if 表达式 带有返回值 （是语句的最后一个类型）
        val mode = if (publicPath == "") {
            DEBUG
        } else {
            USER
        }
        LogUtils.d("工程模式 $mode")

        //when 表达式

        val x = 5
        when (x) {
            is Int -> LogUtils.d("当前数字 $x")
            in 1..100 -> LogUtils.d("$x is in 1..100")
            !in 1..100 -> LogUtils.d("$x is not in 1..100")
        }

        /**
         * 循环语句
         */
        val array = arrayOf("Array", "1", "2", "3", "4", "5", "6", "7");
//1
//        for (s in array) {
//         LogUtils.d("s  is ->  $s ")
//        }
        //2
        //直接执行循环体
        var y = 12
//        while (y > 11) {
//          LogUtils.d("y  is ->  $y ")
//        }
        //3
        //先执行循环体 在进行判断条件
//        do {
//         LogUtils.d("y  is ->  $y ")
//        } while (y > 11)

        //跳出和跳过循环 continue 跳过循环  break 跳出循环

        /**
         * 异常处理 try catch 表达式
         */

        val arg10 = 10
        val arg20 = 20
        val arg = try {
            arg10 / arg20
        } catch (e: Exception) {

        } finally {
            0
        }
        LogUtils.d("arg  is ->  $arg ")


        /**
         * 变长参数
         */
        val arrayInt = intArrayOf(10, 20, 30, 40, 50, 60, 70, 90, 100)
        hello(*arrayInt, string = "你好啊")//*arrayInt 代表展开
        //hello(1, 2, 3, 4666666, string = "展开");
    }

    /**
     * 变长参数 vararg
     */
    fun hello(vararg ints: Int, string: String) {
        ints.forEach { item -> LogUtils.d("ints   的 item  is ->  $item ") }
        LogUtils.d("string  is ->  $string ")
    }
}