package exo3

import java.util.*

class Doctor(private var userId:String, private var firstName:String, private var lastName:String,
             private var userName:String, private var password:String, private var birthDate: Date,
             private var address:String, private var gender:String, private var phone:String,
             private var email:String,private var speciality:String,private var latitude:Double,
             private var longtitude:Double,private var facebookPage:String):
    User(userId,firstName,lastName,userName,password,birthDate,address,gender,phone,email) {

}