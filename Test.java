
// public class Test {
//     public static void main(String[]args){

//     }
// }

// public class Test{


//     public static void main(String[]args){
        
//         int x; // decleration
//         x = 123; // assignment

//         int y = 321; // initialization1`

//         float z = 3.14f; // float requires "f" end of value

//         boolean r = false;

//         char symbol = '@'; // place single quotes for char 

//         // String is reference type must being with capital letter
//         String name = "Akram"; 

//         System.out.println(x);
//         System.out.println("My number is: " + y);
//         System.out.println(z);
//         System.out.println(r);
//         System.out.println(name);
//         System.out.println(symbol);
//     }


    
// } 

// PRIMITIVE            VS     REFERENCE
// 8 types                      unlimited
// stores data                  store and address
// can only hold 1 value        could hold more then 1 value
// less memory                  more memory
// fast                         slower


// PRIMITIVES
// Boolean - 1 bit - true or false
// byte - 1 byte - -128 to 127
// short - 2 bytes - -32,768 to 2 billion
// long - 8 bytes - -9 quintil to 9 quint
// float 4 bytes - fractional number - 6.7 number after decimal 
// double - 8 bytes - fractional number up to 15 digits after decimal ex: 3.1245133145975621
// char - 2 bytes - single character/letter/ASCII value

// REFERENCE
// string - varies - a sequence of characters ex: "hello hi"


// How to declare a variable

// Decleration
// int x;

// Assignment 
// x = 123;

// Initialization
// int x = 123;

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// SWAP TWO VARIABLES
// manually switching the value of 2 values by using a 3rd temporary variable.

// public class Test {

//     public static void main(String[]args){

//         String x = "water";
//         String y = "koolaid";

//         // we require a third temporary variable to store value and use to swap 
//         String temp = null;

//         // now we empty variable x into temp
//         temp = x;
//         // assign y to x
//         x = y;
//         // now take temp variable and store into y
//         y = temp;

//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//     }


// }


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// ACCEPTING USER INPUT
// Scanner class must be imported before we can use
import java.util.Scanner; // Scanner class is found in this util package.

public class Test {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        scanner.nextLine(); // clearing scanner
        
        System.out.println("what is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("your are " + age + " years old");
        System.out.println("you like " + food);
    }
}