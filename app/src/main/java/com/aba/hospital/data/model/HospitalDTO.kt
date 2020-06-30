package com.aba.hospital.data.model

data class HospitalDTO(
    val organisationID: String,
    val organisationCode: String,
    val organisationType: String,
    val subType: String,
    val sector: String,
    val organisationStatus: String,
    val isPimsManaged: String,
    val organisationName: String,
    val address1: String,
    val address2: String,
    val address3: String,
    val city: String,
    val county: String,
    val postcode: String,
    val latitude: String,
    val parentODSCode: String,
    val parentName: String,
    val phone: String,
    val email: String,
    val website: String,
    val fax: String
    ) {

    fun contains(query: String) = when{
        organisationID.contains(query) -> true
        organisationType.contains(query) -> true
        organisationStatus.contains(query) -> true
        organisationName.contains(query) -> true
        address1.contains(query) -> true
        city.contains(query) -> true
        county.contains(query) -> true
        parentName.contains(query) -> true
        else -> false
    }
}