package cn.wlsk.kotlintest

/**
 * @author: Majin
 * @date: 2021/2/22$
 * @desc:
 */
class Child : Parent() {
    //返回非空字符串
    fun getName(): String {
        return "返回名字:李旺财"
    }
}