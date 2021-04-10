package exo3

import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class main {
}
    fun main(args: Array<String>)
    {
        val patient1 = Patient("001","Bakha","Mohamed Issam","Lynx",
            "esi741", LocalDate.of(1999,10,18),"Zeralda",
            "Male","+213556171977","hm_bakha@esi.dz",
            70.2F,180,"A+","firstDisease")
        val patient2 = Patient("002","Benakcha","Iheb Chaker","spider",
            "kiko123", LocalDate.of(1999,12,5),"Batna",
            "Male","+213557856932","hi_benakcha@esi.dz",
            69.2F,175,"B+","secondDisease")
        val patient3 = Patient("003","Fentazi","Riad","yikess",
            "fifo147", LocalDate.of(2000,4,5),"Alger",
            "Male","+213557856932","hi_benakcha@esi.dz",
            80.9F,190,"O+","thirdDisease")

        val doctor1=Doctor("004","Benaissa","Jamel","joo","jojo123",
            LocalDate.of(1980,10,18),"Staouali","Male","+213665412563",
            "Jamelben@gmail.com","Radiologue",55.4125,3.5236,"Docteur Jamel")
        val doctor2=Doctor("005","Djilani","Mohamed","momo","dji321",
            LocalDate.of(1985,10,18),"Tipaza","Male","+213667412563",
            "djilaniMohamed@gmail.com","Ophtalmologue",49.4125,2.5236,"Docteur Djilani")

        val booking1 = Booking(12,LocalDate.of(2021,1,2),LocalTime.now(),patient1,doctor1)
        val booking2 = Booking(13,LocalDate.of(2021,1,2),LocalTime.now(),patient2,doctor2)
        val booking3 = Booking(14,LocalDate.of(2021,1,3),LocalTime.now(),patient3,doctor1)
        val booking4 = Booking(15,LocalDate.of(2021,1,4),LocalTime.now(),patient2,doctor2)

        val treatment1=Treatment(55,"firstDisease","firstTreatment",LocalDate.of(2021,1,2)
            ,booking1)
        val treatment2=Treatment(56,"SecondDisease","secondTreatment",LocalDate.of(2021,1,2)
            ,booking2)
        val treatment3=Treatment(57,"thirdDisease","thirdTreatment",LocalDate.of(2021,1,3)
            ,booking3)
        val treatment4=Treatment(58,"SecondDisease","thirdTreatment",LocalDate.of(2021,1,4)
            ,booking4)

        val bookingManager= BookingManager()
        val treatmentManager = TreatmentManager()

        bookingManager.addBooking(booking1)
        bookingManager.addBooking(booking2)
        bookingManager.addBooking(booking3)
        bookingManager.addBooking(booking4)
        println(bookingManager.getBookingsByPatient(patient1).toString())
        println(bookingManager.getBookingsByDoctor(doctor2).toString())

        treatmentManager.addTreatment(treatment1)
        treatmentManager.addTreatment(treatment2)
        treatmentManager.addTreatment(treatment3)
        treatmentManager.addTreatment(treatment4)
        println(Singleton.listTreatment.toString())
        println("Les traitements de ${patient1.firstName} ${patient1.lastName}: ${treatmentManager.getTreatmentsByPatient(patient2).toString()}")
        println("Le dernier traitements pour le patient ${patient2.firstName} ${patient2.lastName}: ${treatmentManager.getLastTreatment(patient2).toString()}  ")



    }
