package com.example.myapplication

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent

fun setReminder(context: Context, taskId: Long, reminderTimeMillis: Long) {
    val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

    val intent = Intent(context, ReminderReceiver::class.java)
    intent.putExtra("taskId", taskId)
    val pendingIntent = PendingIntent.getBroadcast(context, taskId.toInt(), intent, PendingIntent.FLAG_UPDATE_CURRENT)

    alarmManager.setExact(AlarmManager.RTC_WAKEUP, reminderTimeMillis, pendingIntent)
}

