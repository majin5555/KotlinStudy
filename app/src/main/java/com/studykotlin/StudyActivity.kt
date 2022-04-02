package cn.wlsk.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import cn.wlsk.utils.LogUtils
import com.R


//TODO 编译时常量
//类型后面加?表示可为空
var age: String? = "23"

//抛出空指针异常
val ages = age!!.toInt()

//不做处理返回 null
val ages1 = age?.toInt()

//age为空返回-1
val ages2 = age?.toInt() ?: -1


/** kotlin语言声明与内置数据类型*/
class StudyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)
        // TODO ====================声明变量
        /**
         *
         *   可读可改   变量名   类型    值
         *   var        name:   String="majin"
         *
         */
        var name: String = "majin"
        LogUtils.d(name)
        // TODO ====================内置数据类型
        /**
         * String 字符串
         * char   单字符
         * Boolean true/false
         * Int     整形
         * Double  小数
         * List    集合
         * Set     无重复的元素集合
         * Map     键值对的集合
         */

        //TODO ====================只读变量
        //val 变量值不能修改  var 可以更改
        var info: String = "myInfo"
        info = "123"
        //只读不能修改
        val age: Int = 99
        LogUtils.d(age.toString())

        //TODO ====================范围表达式
        val number = 148
        if (number in 10..59) {
            LogUtils.d("不及格")
        } else {
            LogUtils.d("及格啦 $number")
        }

        //TODO ====================when表达式
        val week = 5
        val infos = when (week) {
            1 -> "今天是周1"
            2 -> "今天是周2"
            3 -> "今天是周3"
            4 -> "今天是周4"
            5 -> "今天是周5"
            else -> {
                LogUtils.d("不满足条件")
            }
        }
        LogUtils.d(infos.toString())

        //TODO ====================String 模板
        val garden = "公园"
        val time = 6
        LogUtils.d("garden:$garden   time:$time")
        val isLogiin = true
        //kt的if是表达式，可以灵活 java if是语句，有局限性
        LogUtils.d("server response result${if (isLogiin) "登录成功" else "登录失败"}")

        //TODO ====================函数学习
        method(30, "张三");
        action1(20, "李四")
        loginAction(age = 20, userpsd = "123", phone = "13051152997", userName = "456")

        show(-1)
    }

    //自定义函数
    private fun method(age: Int, name: String): Int {
        return 200;
    }

    //默认参数
    private fun action1(age: Int, name: String = "张三"): Int {
        LogUtils.d("age $age   name :$name")
        return 200;
    }


    //TODO kotlin语言的具名函数参数
    private fun loginAction(userName: String, userpsd: String, phone: String, age: Int) {
        LogUtils.d("userName$userName   userpsd:$userpsd   phone$phone   age$age")

    }

    //TODO kotlin语言的Unit函数特点  : Unit可以省略 默认就有
    private fun doWork(): Unit {
    }

    //TODO kotlin 语言的Nothing类型的特点
    private fun show(number: Int) {
        val number = when (number) {
            -1 -> "没有当前分数"
            in 0..59 -> "不及格"
            in 60..70 -> "及格"
            else -> {
                "优秀"
            }
        }
        LogUtils.d("number $number")


    }


}