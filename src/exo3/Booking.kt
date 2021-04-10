package exo3

import java.sql.Time
import java.time.LocalDate
import java.time.LocalTime

data class Booking( val bookingId:Long, var bookingDate:LocalDate, var bookingTime:LocalTime,
               var patient:Patient,var doctor:Doctor) {



}