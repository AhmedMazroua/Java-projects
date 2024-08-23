// Defined class
public class StudentTeacherDash {
    // Defined main method
public static void main(String[] args) {
   
   // Calling accessDash() method with input for "User"
   accessDash("Admin");
}

// Defined accessDash method
public static void accessDash(String User) {

   /*Initialized values (normally I would have them all
    lower case or upper case for ease of comparision
    utilizing built in .toLowerCase() or .toUpperCase()
    methods, but for simplicity's sake
    */
String userType1 = "Admin";
String userType2 = "Teacher";
String userType3 = "TA";
String userType4 = "Student";

// Checks conditional for matching stored value "Admin"
if (User == "Admin"){
   System.out.println("Opening Admin Dashboard");
   }

// Checks conditional for matching stored value "Teacher"
else if (User == "Teacher"){
   System.out.println("Opening Teacher Dashboard");
   }

// Checks conditional for matching stored value "TA"
else if (User == "TA"){
   System.out.println("Opening TA Dashboard");
   }

// Checks conditional for matching stored value "Student"
else if (User == "Student"){
   System.out.println("Opening Student Dashboard");
   }

// If "User" is anything other than values stored return denial
else {
   System.out.println("Invalid user type. \n Access Denied.");
   }
}
}
