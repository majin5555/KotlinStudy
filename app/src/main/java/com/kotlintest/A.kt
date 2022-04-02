package cn.wlsk.kotlintest

import cn.wlsk.utils.LogUtils

/**
 * @author: Majin
 * @date: 2021/2/23$
 * @desc:
 */
class A {
    //set get 方法
//    var b = 0
//        get() {
//            LogUtils.d("get方法获取值")
//            return field
//        }
//        set(value) {
//            LogUtils.d("set方法传入的值是$value")
//            field = value
//        }

    class X

    var b = 3
    lateinit var c: String
    lateinit var d: X

    val e: X by lazy {
        LogUtils.d("init x")
        X()
    }
}