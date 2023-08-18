package com.resoluteai.demoapp.util

import android.os.Looper


const val TAG = "CustomThreadHandler"

class CustomHandlerThread: Thread() {

    lateinit var handler: CustomHandler
    lateinit var looper: Looper


    override fun run() {

        Looper.prepare()
        looper = Looper.myLooper()!!
        handler = CustomHandler()
        Looper.loop()

    }


}