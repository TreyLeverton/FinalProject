package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    val id: Int,
    var title: String,
    var date: String,  // You can use this field to store the date of the task
    var reminderTime: Long? = null  // Store reminder time as timestamp
)

