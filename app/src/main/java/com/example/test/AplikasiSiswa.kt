package com.example.test

import android.app.Application
import com.example.test.repositori.ContainerApp
import com.example.test.repositori.ContainerDataApp

class AplikasiSiswa : Application(){
    /**
     * App Container instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}