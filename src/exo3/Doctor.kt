package exo3

import java.time.LocalDate
import java.util.*

data class Doctor( var userId:String,  var firstName:String,  var lastName:String,
              var userName:String,  var password:String,  var birthDate: LocalDate,
              var address:String,  var gender:String,  var phone:String,
              var email:String, var speciality:String, var latitude:Double,
              var longtitude:Double, var facebookPage:String):
    User(userId,firstName,lastName,userName,password,birthDate,address,gender,phone,email) {

}