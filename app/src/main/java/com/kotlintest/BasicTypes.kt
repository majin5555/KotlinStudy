package cn.wlsk.kotlintest

/**
 * @author: Majin
 * @date: 2021/2/20$
 * @desc: 基本类型
 */
class BasicTypes {
    /**Boolean*/
    val aBolean: Boolean = true
    val anotherBolean: Boolean = false

    /**number start*/
    /**Int*/
    val aInt: Int = 8
    val anotherInt: Int = 0xFF
    val maxInt: Int = Int.MAX_VALUE
    val minInt: Int = Int.MIN_VALUE

    /**Long*/
    val aLong: Long = 123456789987654321
    val anotherLong: Long = 1223
    val maxLong: Long = Long.MAX_VALUE
    val minLong: Long = Long.MIN_VALUE

    /**Float*/
    val aFloat: Float = 2.0F
    val anotherFloat: Float = 123F
    val maxFloat: Float = Float.MAX_VALUE
    val minFloat: Float = -Float.MAX_VALUE//特殊

    /**Double*/
    val aDouble: Double = 3.0
    val anotherDouble: Double = 3.1415926
    val maxDouble: Double = Double.MAX_VALUE
    val minDouble: Double = -Double.MAX_VALUE//特殊

    /**Short*/
    val aShort: Short = 127
    val maxShort: Short = Short.MAX_VALUE
    val minShort: Short = Short.MIN_VALUE

    /**Byte*/
    val byte: Byte = 127
    val maxByte: Byte = Byte.MAX_VALUE
    val minByte: Byte = Byte.MIN_VALUE
    /**number end*/

    /**char*/
    val aChar: Char = '0'
    val bChar: Char = '中'
    val cChar: Char = '\u000f'

    /**字符串*/
    val string: String = "HelloWorld"
    val fromCharts: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))


}