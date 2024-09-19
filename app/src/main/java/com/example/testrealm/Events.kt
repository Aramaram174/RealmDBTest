package com.example.testrealm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class Event (
    @PrimaryKey
    var id: Long = 0,
    var gameID: Long = 0
) :RealmObject()