package com.aba.hospital.domain.model

import android.os.Parcel
import android.os.Parcelable

data class HospitalDomainModel(
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
) : Parcelable {

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

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(organisationID)
        parcel.writeString(organisationCode)
        parcel.writeString(organisationType)
        parcel.writeString(subType)
        parcel.writeString(sector)
        parcel.writeString(organisationStatus)
        parcel.writeString(isPimsManaged)
        parcel.writeString(organisationName)
        parcel.writeString(address1)
        parcel.writeString(address2)
        parcel.writeString(address3)
        parcel.writeString(city)
        parcel.writeString(county)
        parcel.writeString(postcode)
        parcel.writeString(latitude)
        parcel.writeString(parentODSCode)
        parcel.writeString(parentName)
        parcel.writeString(phone)
        parcel.writeString(email)
        parcel.writeString(website)
        parcel.writeString(fax)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HospitalDomainModel> {
        override fun createFromParcel(parcel: Parcel): HospitalDomainModel {
            return HospitalDomainModel(parcel)
        }

        override fun newArray(size: Int): Array<HospitalDomainModel?> {
            return arrayOfNulls(size)
        }
    }
}