package com.orbitalsonic.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var notificationUtils: NotificationUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickMethod()
        notificationUtils = NotificationUtils(this)


    }

    private fun onClickMethod() {

        val btnSimpleNotify: Button = findViewById(R.id.btn_simple_notify)
        btnSimpleNotify.setOnClickListener {
            notificationUtils.initNotificationBuilderSimple()
            notificationUtils.launchNotification()

        }

        val btnLargeTextNotify: Button = findViewById(R.id.btn_large_text_notify)
        btnLargeTextNotify.setOnClickListener {
            notificationUtils.initNotificationBuilderLargeText()
            notificationUtils.launchNotification()

        }

        val btnTapActionNotify: Button = findViewById(R.id.btn_tap_action_notify)
        btnTapActionNotify.setOnClickListener {
            notificationUtils.initNotificationBuilderTapAction()
            notificationUtils.launchNotification()

        }

        val btnActionButtonNotify: Button = findViewById(R.id.btn_action_button_notify)
        btnActionButtonNotify.setOnClickListener {
            notificationUtils.initNotificationBuilderActionButton()
            notificationUtils.launchNotification()

        }
    }





}