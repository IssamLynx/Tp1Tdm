package exo3

import java.time.LocalDate

data class Patient( var userId:String, var firstName:String, var lastName:String,
               var userName:String, var password:String, var birthDate: LocalDate,
               var address:String, var gender:String, var phone:String,
               var email:String, var weight:Float, var height:Int,
               var bloodType:String,  var personalDisease:String):
              User(userId,firstName,lastName,userName,password,birthDate,address,gender,phone,email) {

              }

