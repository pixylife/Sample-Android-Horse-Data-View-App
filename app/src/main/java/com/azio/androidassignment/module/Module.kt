package com.azio.androidassignment.module

import org.koin.dsl.module.module

/**
* Define every data modules here
*/
val DataModule = module {

}

/**
 * Define every business  logic & UI related modules here
 */
val PagesModule = module {

}

//Assign every module to one app module
val appModules = listOf(DataModule, PagesModule)
