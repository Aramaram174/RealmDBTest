package com.example.testrealm

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        val config = RealmConfiguration.Builder()
            .name("myrealm.realm")
            .deleteRealmIfMigrationNeeded()
            .migration(RealmMigrations())
            .schemaVersion(1)
            .build()
        Realm.setDefaultConfiguration(config)
    }
}