package com.example.petshop

abstract class Mood (val name : String, val age : Int, val date : String) {
    abstract fun message(): String
}