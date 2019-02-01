package com.dvird.enterprise_iot_architecture.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class DeviceService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
