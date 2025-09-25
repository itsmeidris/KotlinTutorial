fun main(){
    val user1 = User(1 ,"Driss Loulidi" ,"idriissloulidi@gmail.com");
    //toString() method
    println(user1.toString()) 
    //copy()
    val user2 = user1.copy(id = 2, email = "driss2@gmail.com")
    println("Copied user : $user2")
    //equals() method
    var checking = if(user1 == user2) "Same user" else "Different user"
    println(checking);

    val userSession = UserSession(user1);
    userSession.logout();
    println(userSession.userState());

}

//1-🔹 What is a Data Class?
//Data class is special class in Kotlin designed to hold data
//It generates automatically constructor, getters and setters ,toString()-equals()-hashCode()-copy() methods

//2-🔹 Requirements?
// Must have at least one parameter in the primary constructor.
// Parameters must be marked as val or var.
// Cannot be abstract, open, sealed, or inner.
 
//3-🔹 When to Use Data Classes?
//DTOs (Data Transfer Objects)
//API Responses
//Value Objects
//Simple state containers 

//Data class to hold user's infos
data class User(val id:Int, var name:String, var email:String)

// This models the *behavior* of a user inside the system
class UserSession(val user : User){

    private var isLoggedIn = false;

    fun login(){
        isLoggedIn = true;
        println("${user.name} logged in ✅");
    }
    fun logout(){
        isLoggedIn = false;
        println("${user.name} logged out ❌");
    }

    fun userState() : String = if(isLoggedIn) "--${user.name} is active--" else "--${user.name} is inactive--";

}
