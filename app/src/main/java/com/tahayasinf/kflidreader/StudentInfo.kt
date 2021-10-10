package com.tahayasinf.kflidreader

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class StudentInfo {
    var std_fingerprintID:Int = 0
    var std_datetime:String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).toString()

    constructor(std_datetime:String, std_fingerprintID:Int){
        this.std_fingerprintID = std_fingerprintID
        this.std_datetime = std_datetime
    }

}