
// import the class
//import KotlinFlowControl.KotlinFlowControl 
//import KotlinDataTypes.KotlinDataTypes  
//import KotlinIO.KotlinIO
import KotlinOOP.Person 
import KotlinOOP.Employee

fun main() {
    //println(KotlinDataTypes.informations);
    //KotlinIO.getUserInfos();
    //println(KotlinFlowControl.checkAdult(52, "Driss"));
    //println(KotlinFlowControl.checkDay(1));
    //KotlinFlowControl.displayBillionaires();
    
    //Instantiate the classes
    val p1 = Person("Driss Loulidi" ,23 ,'M' ,true);
    val emp1 = Employee("Driss Loulidi" ,23 ,'M' ,true, "Software Engineer", 9500.0);
    
    //Access the fields and methods
    p1.displayInfos();
    emp1.displayInfos();
}