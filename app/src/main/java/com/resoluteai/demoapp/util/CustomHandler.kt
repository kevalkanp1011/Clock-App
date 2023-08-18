package com.resoluteai.demoapp.util

import android.os.Handler
import android.os.Message
import android.util.Log

class CustomHandler: Handler() {

    override fun handleMessage(msg: Message) {
        when(msg.what) {
            2 -> {
                Log.d("CustomHandler", "message got $2")
            }
            else -> {
                Log.d("CustomHandler", "message got ${msg.what}")
            }
        }
    }
}