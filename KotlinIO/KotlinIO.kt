package KotlinIO

//In Kotlin, you can do this by creating a separate class or file 
//that handles all I/O, and then call it from main.kt.
class KotlinIO{
    companion object{
        fun readString(prompt: String): String{
            print(prompt);
            return readLine()!!.lowercase().trim();
        }

        fun readInt(prompt: String) :Int{
            print(prompt);
            return readLine()!!.trim().toInt();
        }

        fun readDouble(prompt: String) :Double{
            print(prompt);
            return readLine()!!.trim().toDouble();
        }
        
        fun readBoolean(prompt: String) :Boolean{
            print(prompt);
            return readLine()!!.lowercase().trim().toBoolean();
        }

        fun printMessage(message: String){
            println(message);
        }
        fun getUserInfos(){
            var name = KotlinIO.readString("Hello there, what's your name ? ");
            var age = KotlinIO.readInt("Welcome $name, how old are you ? ");
            var height = KotlinIO.readDouble("And how tall are you (in meters) ? ");
            var isDevelopper = KotlinIO.readString("One last question, wich type of developper are you (Mobile / Web / Desktop / Else) ? ");
            
            //Use when expression to determine the type of developper
            val typeOfDevelopper = when(isDevelopper){
                "mobile" -> "Mobile Developper" 
                "web" -> "Web Developper"
                "desktop" -> "Desktop Developper"
                else -> "Developper ff"
            }
    
    
        KotlinIO.printMessage("\n--- User Info ---")
        KotlinIO.printMessage("Full Name: $name");
        KotlinIO.printMessage("Age: $age years old");
        KotlinIO.printMessage("Height: $height m");
        KotlinIO.printMessage("Developper: $typeOfDevelopper");
        KotlinIO.printMessage("---------")
        }
    }

}