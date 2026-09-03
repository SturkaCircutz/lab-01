package com.example.petshop

class Sad (name: String, age : Int, date : String): Mood(name, age, date){
    override fun message(): String{
        return("my name is $name, i am $age years old, im sad now at $date")
    }
}