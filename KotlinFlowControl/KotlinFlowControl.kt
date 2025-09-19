package KotlinFlowControl

import kotlin.collections.mutableListOf

class KotlinFlowControl{
    companion object{
        
        var i: Int = 0;

        val billioanaires = mutableListOf<String>("Jeff Bezos", "Elon Musk", "Bill Gates");
        
        //Normal if-else statement
        fun checkAdult(age: Int ,name: String) :String{
            //Always check for negative values first
            if(age <= 0){
                return "Age cannot be negative"

            }else if(age >= 18){
                return "$name is an adult"

            }else{
                return "$name is a minor"
            }
        }

        //When statement (like switch-case in other languages)
        fun checkDay(dayNumber: Int) : String{
            when(dayNumber){
                1 -> return "Today is Monday";
                2 -> return "Today is Tuesday";
                3 -> return "Today is Wednesday";    
                4 -> return "Today is Thursday";
                5 -> return "Today is Friday";
                6 -> return "Today is Saturday";
                7 -> return "Today is Sunday";
                else -> return "Invalid day number"; //default case
            }
        }

        //For loop 
        fun displayBillionaires(){
            println("List of the richest people in the world :");            
            println("Add a new billionaire: ");
            var newBillionaire: String = readLine()!!.trim().toString();
            //Add method of lists
            billioanaires.add(newBillionaire);
            for(blr in billioanaires){
                println("Billionaire No. ${i + 1}: $blr");
                i++;
            }
        }
        
    }
}