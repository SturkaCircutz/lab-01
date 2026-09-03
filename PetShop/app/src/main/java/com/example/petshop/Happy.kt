package com.example.petshop

class Happy (name: String, age : Int, date : String): Mood(name, age, date){
    override fun message() : String{
        return "$name is happy at $date, aged $age"
    }
}