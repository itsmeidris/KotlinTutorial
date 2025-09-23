package KotlinOOP1

//Marked as open to allow inheritance
open class Person(var name: String,var age: Int?,var gender: Char,var isAdult: Boolean?){
    
    //Once the declaration of fields, getters and setters are automatically created in Kotlin
    //1. Getters and setters for var fields ; val fields have only getters
    /*
    get() = field 
    set(value) {
        field = value
    }
    */
    
    //2. Helper method to check if the person is adult or not
    private var isPersonAdult: String = "Not an adult";
    fun checkIfPersonIsAdult(){
        if (age!! <= 0) {
            age = 0;
            isAdult = null;
            isPersonAdult = "Invalid age";
        }else if(age!! >= 18){
            isAdult = true;
            isPersonAdult = "An adult";
        }else{
            isAdult = false;
            isPersonAdult = "Not an adult";
        }
        
    }
    
    //3. Initializer block to load once the class is instantiated
    init{checkIfPersonIsAdult()}
    
    //4. Function to display Person data
    open fun displayInfos(){
        println("----- Person Infos -----");
        println("Name : $name");
        println("Age : $age");
        println("Gender : $gender");
        println("The person is : $isPersonAdult");
        println("------------------------");
    }

    //5. Override the toString() method to display Person data in form of strings not memory reference
    override fun toString(): String{
        return "Person(name : $name, age : $age : $gender, isAdult : $isAdult)";
    }
}

//5. Inheritance allows a class to inherit from another class by integrating all its fields and methods
//6. Call the parent constructor 
class Employee(
    name: String,
    age: Int?,
    gender: Char,
    isAdult: Boolean?,
    var jobTitle: String,
    var salary: Double
):Person(name, age, gender, isAdult) {

    //7. Method overriding to change the behavior of a method in the child class
    override fun displayInfos(){
        //8. Override the paren the method if needed to update it
        super.displayInfos();
        println("Job Title : $jobTitle");
        println("Salary : ${salary.toInt()} MAD");
        println("------------------------");
    }
}