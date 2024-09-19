package com.example.testrealm

import android.os.Bundle
import androidx.activity.ComponentActivity
import io.realm.Realm
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addEvent()
    }

    private fun addEvent() {
        CoroutineScope(Dispatchers.IO).launch {
            val realm = Realm.getDefaultInstance()
            realm.use {
                it.executeTransaction { transactionRealm ->
                    val event = transactionRealm.createObject(Event::class.java, 1)
                    event.gameID = 123
                }
            }
        }
    }
}