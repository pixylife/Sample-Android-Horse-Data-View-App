package com.azio.androidassignment.model.data_source

import android.content.Context
import com.azio.androidassignment.model.Horse
import com.azio.androidassignment.network.APIInterface
import com.azio.androidassignment.util.NetworkStatus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HorseDataSourceImpl(private val ctx: Context, private val apiInterface: APIInterface) : HorseDataSource{

      override fun getHorseDetailForClient(id: String, userName: String, callBack: HorseDataSource.GetHorseDataCallBack) =
          if (NetworkStatus().isConnected(ctx)) {
             apiInterface.getHorseForClient(id,userName).enqueue(object :Callback<Horse>{

                 override fun onResponse(call: Call<Horse>, response: Response<Horse>) {
                    if(response.isSuccessful){
                        response.body()?.let { callBack.onSuccess(it) }
                    }else{
                        callBack.onFailed("Something went wrong..!")
                    }
                 }

                 override fun onFailure(call: Call<Horse>, t: Throwable) {
                    callBack.onFailed(t.localizedMessage)
                 }

             })

                            } else {
              callBack.onFailed("No internet connection")
          }
}