package exo3

import java.time.LocalDate

data class Treatment( var treatmentId:Long, var disease:String, var treatmentDescription:String,
                var treatmentDate:LocalDate,var booking:Booking) {
}