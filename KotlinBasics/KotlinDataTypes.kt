//package KotlinBasics  // package name matches folder
package KotlinDataTypes

import kotlin.collections.mutableListOf

class KotlinDataTypes{
    companion object{
        //Decalaring variables and constants data types
       val myName: String = "Driss Loulidi"; //String - constant
       var myAge: Int = 23; //Integer - variable
       var myHeight: Double = 1.83; //Double - variable
       val myGender: Char = 'M'; //Character - constant
       var myCountry: String = "Morocco"; //String - variable
       var amIDevelopper: Boolean = true; //Boolean - variable
       var mySalary: Float = 10580.550F; //Float - variable
       
       //Mutable (Changeable) and Immutable (Unchangeable) list
       val mySalaryGoals = listOf<Int>(15000, 25000, 35000 ,50000 ,150000 ,999999); //Immutable list
       var mySkills = mutableListOf<String>("Flutter, Dart, Kotlin, Android, NodeJs ,JavaScript"); //Mutable list
       
       //Converting data types
       var myNetSalary: Int = mySalary.toInt(); //Float to Integer
       
       //String concatenation 
       var informations = "My name is $myName\nMy age is $myAge\nMyHeight is $myHeight\nMy gender is <$myGender>\nMy country is $myCountry\nAm I developper ? $amIDevelopper\nMy salary is $myNetSalary Dhs\nMy salary goals are $mySalaryGoals\nMy skills are $mySkills";
       
       //This is  gonna be executed when the class is loaded
       init{
           println("This function is executed first when the class is loaded");
       }
       
       
    }
}