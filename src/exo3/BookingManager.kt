package exo3

class BookingManager {
fun addBooking(booking:Booking) {
    Singleton.listBooking.add(booking)
}
fun getBookingsByPatient(patient:Patient):List<Booking>{

    return  Singleton.listBooking.filter{it.patient.userId==patient.userId}
}

    fun getBookingsByDoctor(doctor:Doctor):List<Booking>{

        return  Singleton.listBooking.filter{it.doctor.userId==doctor.userId}
    }

}