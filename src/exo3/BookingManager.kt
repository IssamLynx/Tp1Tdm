package exo3

class BookingManager {
fun addBooking(booking:Booking) {
    Singleton.listBooking.add(booking)
}

}