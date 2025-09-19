package KotlinOOP

class Person(val name: String,var age: Int?,val gender: Char,var isAdult: Boolean?){
    
    
    private var isPersonAdult: String = "Not an adult";
    
    init{
        if (age!! <= 0) {
            age = 0;
            isPersonAdult = "Invalid age";
        }else if(age!! >= 18){
            isAdult = true;
            isPersonAdult = "An adult";
        }else{
            isAdult = false;
            isPersonAdult = "Not an adult";
        }
        println("Name : $name -- Age : $age -- Gender : $gender -- Is Adult ? $isPersonAdult");
    }
    override fun toString(): String{
        return "Person(name : $name, age : $age : $gender, isAdult : $isAdult)";
    }
}
