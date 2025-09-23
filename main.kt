
// import the class
//import KotlinFlowControl.KotlinFlowControl 
//import KotlinDataTypes.KotlinDataTypes  
//import KotlinIO.KotlinIO
//import KotlinOOP1.Person 
//import KotlinOOP1.Employee

import KotlinOOP2.CreditCardPayment
import KotlinOOP2.PayPalPayment
import KotlinOOP2.BankTransferPayment
import KotlinOOP2.Payment

fun main() {
    //1.Kotlin basics
    //---------------------------------
    //println(KotlinDataTypes.informations);
    //KotlinIO.getUserInfos();
    //println(KotlinFlowControl.checkAdult(52, "Driss"));
    //println(KotlinFlowControl.checkDay(1));
    //KotlinFlowControl.displayBillionaires();
    //---------------------------------


    //2. Kotlin OOP + Inheritance
    //---------------------------------
    //Instantiate the classes
    //val p1 = Person("Driss Loulidi" ,23 ,'M' ,true);
    //val emp1 = Employee("Driss Loulidi" ,23 ,'M' ,true, "Software Engineer", 9500.0);
    
    //Access the fields and methods
    //p1.displayInfos();
    //emp1.displayInfos();
    //---------------------------------


    //2. Kotlin OOP + Abstraction
    //---------------------------------
    //val payment1 = CreditCardPayment("Credit card");
    //val payment2 = PayPalPayment("PayPal");
    //val payment3 = BankTransferPayment("Bank transfer");
    
    val paymentType = listOf<Payment>(
        CreditCardPayment("Credit card" ,99.99, "USD", "2025-09-23"),
        PayPalPayment("PayPal" ,-199.99, "USD", "2025-11-03"),
        CreditCardPayment("Credit card" ,5500.45, "USD", "2025-09-21"),
    );
    
    for(payment in paymentType){
        payment.processPayment();
    }

    //payment1.processPayment();
    //payment2.processPayment();
    //payment3.processPayment();
    //---------------------------------


}