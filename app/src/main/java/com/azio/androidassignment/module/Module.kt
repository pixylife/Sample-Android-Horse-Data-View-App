package com.azio.androidassignment.module

import com.azio.androidassignment.model.data_source.HorseDataSourceImpl
import com.azio.androidassignment.network.APIInterface
import com.azio.androidassignment.util.ServiceGenerator
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

/**
* Define every data modules here
*/
val DataModule = module {

    single ("apiInterface") {  ServiceGenerator.getClient()!!.create(APIInterface::class.java)}
    single ("horseDataSource"){ HorseDataSourceImpl(androidContext(),get("apiInterface")) }
}

/**
 * Define every business  logic & UI related modules here
 */
val PagesModule = module {

}

//Assign every module to one app module
val appModules = listOf(DataModule, PagesModule)
