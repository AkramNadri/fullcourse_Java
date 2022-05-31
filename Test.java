import java.util.Random;
import java.util.Scanner;

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
// import java.util.Scanner; // Scanner class is found in this util package.

// public class Test {
//     public static void main(String[]args){
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is your name?");
//         String name = scanner.nextLine();

//         System.out.println("how old are you?");
//         int age = scanner.nextInt();

//         scanner.nextLine(); // clearing scanner
        
//         System.out.println("what is your favourite food?");
//         String food = scanner.nextLine();

//         System.out.println("Hello " + name);
//         System.out.println("your are " + age + " years old");
//         System.out.println("you like " + food);
//     }
// }

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// EXPRESSIONS
// expression = operands & operators
// operands = values, variables, numbers, quantity
// operators = + - * / %


// public class Test {
//     public static void main(String[]args){

//         int friends = 10;

//         friends = friends + 1;

//         friends = friends % 3; // modulas gives us the remainder

//         // shorthand way of incrementing
//         friends++;
//         // decrement
//         friends--;

//         // since we are using int, the remainder of the value will be truncated.
//         System.out.println(friends);
//     }
// }


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// GUI intro - Graphical user interface
// import javax.swing.JOptionPane;

// public class Test {
//     public static void main(String[]args){

//         String name = JOptionPane.showInputDialog("Enter your name");
//         JOptionPane.showMessageDialog(null, "hello " + name);

//         // showInputDialog its going to return a String, but were attempting to place an integer in here. Must use Integer.parseInt - will parseInt method will convert it to integer that we can store it within our integer variable age.
//         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//         JOptionPane.showMessageDialog(null, "You are " + age + " years old");

//         // Here we are parsing for Double value
//         double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//         JOptionPane.showMessageDialog(null, "You are " +height+ " cm tall");
//     }
// }


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// MATH CLASS
// more information on Math class in Java documentation.

// public class Test {
    // public static void main(String[]args){

    //     double x = 3.14;
    //     double y = -10;

    //    // compares the values and prints out higher one.
    //    double max =  Math.max(x, y);
    //    // prints least  
    //    double min =  Math.min(x, y);

    //    // will print absolute number
    //    double abs = Math.abs(y);

    //    // prints the sqaure root of number
    //    double sqrt = Math.sqrt(x);

    //    // will always round down
    //    double floor = Math.floor(x);


    //    System.out.println(max);
    //    System.out.println(min);
    //    System.out.println(abs);
    //    System.out.println(sqrt);
    //    System.out.println(floor);

    // Find the hypotenuse of triangle
//     double x;
//     double y;
//     double z;

//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Enter side x: ");
//     x = scanner.nextDouble();

//     System.out.println("Enter side y: ");
//     y = scanner.nextDouble();


//     z = Math.sqrt((x*x) + (y*y));

//     System.out.println("The hypotenuse is: " +z);

//     scanner.close();
    

//     }
// }

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// GENERATE RANDOM NUMBERS
// import java.util.Random;


// public class Test {
//     public static void main(String[]args){

//         Random random = new Random();

//         // we pass in a value to nextInt method to set range of numbers to randomize.
//         int x = random.nextInt(6)+1;


//         double y = random.nextDouble(10)+1;

//         boolean z = random.nextBoolean();

//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

// IF/ELSE STATEMENTS

// public class Test {

// public static void main(String [] args){

// double x = 7;
// double y = 5;

// if(y >= x) {
//     System.out.println("Y is greater then X");
// } else {
//     System.out.println("X is greater then Y");
// }


// }

// }

///////////////////////////////////////////////////////////

// Reserved key words are keywords which are used for the language itself. 

// Example : package, public, class, static, etc...



///////////////////////////////////////////////////////////

// Arithmatic operations

// public class Test {

//     public static void main(String[] args){

// int ten = 10;
// int two = 2;

// int addition = ten + two;
// System.out.println(addition);

//     }

// }


///////////////////////////////////////////////////////////

// Math class

// allows us to perform extra operations on numbers

public class Test {

    public static void main(String[] args){

System.out.println(Math.abs(-10));
System.out.println(Math.max(3.6, 10.12));
System.out.println(Math.min(3, 5));
System.out.println(Math.pow(5.0, 2.0));
System.out.println(Math.sqrt(4.6));

    

}
}