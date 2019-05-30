package com.azio.androidassignment.model

data class Sales(
    val Horse: String? = null,
    val HorseId: Long? = 0,
    val Price: Int? = 0,
    val Vendor: String? = null,
    val Purchaser: String? = null,
    val Lot: Double? = 0.0,
    val SaleName: String? = null,
    val SessionName: String? = null,
    val SaleStartDate: String? = null,
    val SalesCompany: String? = null,
    val SalesStatus: String? = null,
    val PassedInValue: String? = null,
    val SalesId: Long? = 0,
    val PdfImgPath: String? = null,
    val SalesImgPath: String? = null,
    val CountryCode: String? = null,
    val CountryCurrency: String? = null,
    val CurrencyCode: String? = null,
    val CompanyLogo: String? = null
)