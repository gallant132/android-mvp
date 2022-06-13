package com.example.mvp

class MainActivityPresenter(private val mainActivityView: MainActivityView) {
    fun hitungLuasPersegiPjg(panjang: Float,lebar: Float){

        if(panjang == 0F){
            mainActivityView.showError("Panjang Tidak Boleh 0")
            return
        }
        if (lebar ==0F){
            mainActivityView.showError("Lebar Tidak Boleh 0")
            return
        }

        if (panjang==lebar){
            mainActivityView.showError("Panjang dan Lebar tidak Boleh sama")
            return
        }

        val luas = panjang*lebar;
        mainActivityView.updateLuasPersegiPjg(luas)
    }

    fun hitungKelilingPersegiPjg(panjang: Float, lebar: Float){

        if(panjang == 0F){
            mainActivityView.showError("Panjang Tidak Boleh 0")
            return
        }
        if (lebar ==0F){
            mainActivityView.showError("Lebar Tidak Boleh 0")
            return
        }

        if (panjang==lebar){
            mainActivityView.showError("Panjang dan Lebar tidak Boleh sama")
            return
        }

        val keliling = 2*(panjang+lebar)
        mainActivityView.updateKelilingPersegiPjg(keliling)
    }

    fun hitungLuasPersegi(panjang: Float,lebar: Float){

        if(panjang == 0F){
            mainActivityView.showError("Panjang Tidak Boleh 0")
            return
        }
        if (lebar ==0F){
            mainActivityView.showError("Lebar Tidak Boleh 0")
            return
        }

        if (panjang!=lebar){
            mainActivityView.showError("Panjang sisi dan Lebar  sisi harus sama")
            return
        }

        val luas = panjang*lebar;
        mainActivityView.updateLuasPersegi(luas)
    }

    fun hitungKelilingPersegi(panjang: Float,lebar: Float){

        if(panjang == 0F){
            mainActivityView.showError("Panjang Tidak Boleh 0")
            return
        }
        if (lebar ==0F){
            mainActivityView.showError("Lebar Tidak Boleh 0")
            return
        }

        if (panjang!=lebar){
            mainActivityView.showError("Panjang sisi dan Lebar  sisi harus sama")
            return
        }

        val keliling = (2*panjang)+(2*lebar);
        mainActivityView.updateKelilingPersegi(keliling)
    }

}