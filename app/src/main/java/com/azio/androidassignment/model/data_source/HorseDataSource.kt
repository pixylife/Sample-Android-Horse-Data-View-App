package com.azio.androidassignment.model.data_source

import com.azio.androidassignment.model.Horse
import com.azio.androidassignment.network.APIInterface

interface HorseDataSource {
    interface GetHorseDataCallBack{
        fun onSuccess(horse: Horse)
        fun onFailed(message: String)
    }

    fun getHorseDetailForClient(id : String,userName : String, callBack: GetHorseDataCallBack)
}