//package KotlinBasics  // package name matches folder
package KotlinDataTypes

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
       //Converting data types
       var myNetSalary: Int = mySalary.toInt(); //Float to Integer
       
       //String concatenation 
       var informations = "My name is $myName\nMy age is $myAge\nMyHeight is $myHeight\nMy gender is <$myGender>\nMy country is $myCountry\nAm I developper ? $amIDevelopper\nMy salary is $myNetSalary Dhs";
       
       //This is  gonna be executed when the class is loaded
       var checkingResult: String = if(amIDevelopper) "Yes, I am developper" else  "No, I am not developper"
       init{
           println(checkingResult);
       }
       
       
    }
}