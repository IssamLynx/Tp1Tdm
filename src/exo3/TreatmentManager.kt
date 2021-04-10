package exo3

class TreatmentManager {
    fun addTreatment(treatment:Treatment) {
        Singleton.listTreatment.add(treatment)
    }
    fun getTreatmentsByPatient(patient:Patient):List<Treatment>?{
        val bookings = Singleton.listBooking.filter{it.patient.userId==patient.userId}


        return  Singleton.listTreatment.filter{it.booking in bookings}
    }

    fun getLastTreatment(patient:Patient):Treatment?{
        val bookings = Singleton.listBooking.filter{it.patient.userId== patient.userId}
        return  Singleton.listTreatment.sortedBy { it.treatmentDate }.findLast { it.booking in bookings }
    }
}