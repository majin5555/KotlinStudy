package cn.wlsk.utils

/**
 * @author: Majin
 * @date: 2021/2/20$
 * @desc: 日志打印
 */
import android.util.Log
import java.util.*

object LogUtils {
    private val isDebug: Boolean = true
    private val TAG: String = "majin"

    /**
     *包装log.d日志
     */
    fun d(msg: String) {
        if (isDebug) {
            Log.d(TAG, msg)
        }
    }

    /**
     *包装log.e日志
     */
    fun e(msg: String) {
        if (isDebug) {
            Log.e(TAG, msg)
        }
    }

    /**
     * v类型的log.v日志
     */
    fun v(msg: String) {
        if (isDebug) {
            Log.v(TAG, msg)
        }
    }    /**
     * i类型的log.v日志
     */
    fun i(msg: String) {
        if (isDebug) {
            Log.i(TAG, msg)
        }
    }
}
