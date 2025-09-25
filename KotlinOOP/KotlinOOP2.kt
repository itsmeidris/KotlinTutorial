
fun main(){
    val paymentType = listOf<Payment>(
        CreditCardPayment("Credit card" ,99.99, "USD", "2025-09-23"),
        PayPalPayment("PayPal" ,-199.99, "USD", "2025-11-03"),
        CreditCardPayment("Credit card" ,5500.45, "USD", "2025-09-21"),
    );
    
    for(payment in paymentType){
        payment.processPayment();
    }
}
//Mark the class as an abstract class 
//By default all propeties and functions are open in abstract class
abstract class Payment(
    val paymentProcess:String,
    var amount : Double?,
    val currency : String,
    val date: String
){
    
    //Validate amount > 0 or restrict supported currencies.
    init{
        amount = if ((amount ?: 0.0) < 0) 0.0 else amount
    }

    //Abstract method without body to be implemented in subclasses
    abstract fun processPayment();
    //Concrete method with body
    fun printReceipt(){
        println("Amount to pay : $amount $currency");
        println("Date : $date");
    }

}

//Create a subclass that inherits from the abstract class
class CreditCardPayment(paymentProcess:String, amount:Double, currency:String, date:String): Payment(paymentProcess, amount, currency, date){

    override fun processPayment(){
        println("-------------");
        println("Payment process : $paymentProcess");
        super.printReceipt();
        println("-------------");
    }
}

class PayPalPayment(paymentProcess:String, amount:Double, currency:String, date:String): Payment(paymentProcess, amount, currency, date){

    override fun processPayment(){
        println("-------------");
        println("Payment process : $paymentProcess");
        super.printReceipt();
        println("-------------");
    }
}

class BankTransferPayment(paymentProcess:String, amount:Double, currency:String, date:String): Payment(paymentProcess, amount, currency, date){

    override fun processPayment(){
        println("-------------");
        println("Payment process : $paymentProcess");
        super.printReceipt();
        println("-------------");
    }
}