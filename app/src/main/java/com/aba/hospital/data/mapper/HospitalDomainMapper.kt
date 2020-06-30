package com.aba.hospital.data.mapper

import com.aba.hospital.base.Mapper
import com.aba.hospital.domain.model.HospitalDomainModel
import com.opencsv.CSVReader
import java.io.StringReader

class HospitalDomainMapper : Mapper<String, List<HospitalDomainModel>> {


    override fun map(items: String): List<HospitalDomainModel> =
        mutableListOf<HospitalDomainModel>().apply {
            val reader = CSVReader(StringReader(items))
            for (line in reader.readAll()) {
                try {
                    addToList(line[0].split("�"))
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            // Remove the header
            removeAt(0)
        }


    private fun MutableList<HospitalDomainModel>.addToList(line: List<String>) {
        add(
            HospitalDomainModel(
                organisationID = line[0],
                organisationCode = line[1],
                organisationType = line[2],
                subType = line[3],
                sector = line[4],
                organisationStatus = line[5],
                isPimsManaged = line[6],
                organisationName = line[7],
                address1 = line[8],
                address2 = line[9],
                address3 = line[10],
                city = line[11],
                county = line[12],
                postcode = line[13],
                latitude = line[14],
                parentODSCode = line[15],
                parentName = line[16],
                phone = line[17],
                email = line[20],
                website = line[21],
                fax = ""
            )
        )
    }

}