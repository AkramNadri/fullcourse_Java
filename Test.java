import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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

// public class Test {

//     public static void main(String[] args){

// System.out.println(Math.abs(-10));
// System.out.println(Math.max(3.6, 10.12));
// System.out.println(Math.min(3, 5));
// System.out.println(Math.pow(5.0, 2.0));
// System.out.println(Math.sqrt(4.6));

    

// }
// }

///////////////////////////////////////////////////////////

// Comparison operator

// public class Test {

//     public static void main(String[] args){

// int akAge = 38;
// int mariamAge = 20;

// // boolean whoIsOlder = akAge > mariamAge;

// // System.out.println(whoIsOlder);
    
// System.out.println(akAge > mariamAge);
// System.out.println(akAge < mariamAge);
// System.out.println(akAge == mariamAge);
// System.out.println(akAge != mariamAge); // != not equal

// System.out.println(akAge >= mariamAge); // greater or equal
// System.out.println(akAge <= mariamAge); // less or equal


// }
// }

///////////////////////////////////////////////////////////

// Logical operators

// public class Test {

//     public static void main(String[] args){

//         String name = Mariam;
// boolean isAdult = false;
// boolean isStudent = true;
// boolean isAmgigos = false;

// // And operator - checks if both expressions are true, all expression must be true in order for this entire epression return true.
// System.out.println(isAdult && isStudent);

// // Or operator - checks if a single part of the expression is true, will return true.
// System.out.println(isAdult || isStudent);
    
// System.out.println((isAdult || isStudent) && isAmgigos);

// // Is not - how to flip the value.
// System.out.println((!isAdult || isStudent) && !isAmgigos);

// System.out.println(10 > 8 || 2 < 6 && isAdult && 
// name.contains("M"));
// }
// }


///////////////////////////////////////////////////////////

// If statements

// public class Test{

//     public static void main(String[] args){

// int age = 17;

// if(age >= 18){
//     System.out.println("Is an adult");
// } else if (age >= 16 && age < 18){
//     System.out.println("i am almost an adult");

// } else {
//     System.out.println("I am not an adult");
// }
//     }
// }

///////////////////////////////////////////////////////////

// Ternary operator
// should be used when you are evaluating one boolean expression. 

// public class Test{

//     public static void main(String[] args) {

// int age = 15;
// String message = age >= 18 ? "Is adult" : "not an adult";

// System.out.println(message);
//     }
// }

///////////////////////////////////////////////////////////

// Switch statement

// public class Test{

//     public static void main(String[] args){
    
//     String gender = "male";


//     // if (gender.equals("female")){

//     // } else if(gender.equals("male")){

//     // } else if(gender.equals("prefer not to say")){

//     // } else{

//     // }

//     switch (gender) {
        
//         case "female" :
//         System.out.println("I am a female");
//             break;

//         case "male":
//         System.out.println("I am a male");
//             break;

//         case "prefer not to say":
//         System.out.println("prefer not to say");
//             break;

//         default:
//         System.out.println("I am alien?");
//     }
// }

// }

///////////////////////////////////////////////////////////

// Arrays - create one variable that holds more then one value.

// public class Test{

// public static void main(String[] args){

// // with Array we must specify the size of the array
// int [] numbers = new int[2];
// // insert values into array
// numbers[0] = 1;
// numbers[1] = 2;

// // another method of adding to an array
// int [] numbersNew = {2, 0, 1, 100, -200};

// // Array of boolean
// boolean [] numbersBoolean = new boolean[3];

// numbersBoolean[1] = true;

// // Array of String
// String [] stringArray = new String[4];

// stringArray[3] = "last string in array";

// System.out.println(Arrays.toString(numbers));
// System.out.println(Arrays.toString(numbersBoolean));
// System.out.println(Arrays.toString(stringArray));
// System.out.println(Arrays.toString(numbersNew));
// System.out.println(numbersNew.length);

// }

// }

///////////////////////////////////////////////////////////

// Arrays and indexes

// public class Test{


//     public static void main(String[] args){

//         int [] numbers = {2, 1, 4, 5, 33, 532, 23};
//         int positionInArray = numbers[4];
//         int indexInArray = numbers.length;

//         System.out.println(positionInArray);
//         System.out.println(indexInArray);


//     }
// }

///////////////////////////////////////////////////////////

// public class Test{


//     public static void main(String[] args){

// int [] numbers = {1, 3, 5, 6, 87, 34, 8, 34, 98};

// int number = 0;
// // increment
// number++;
// // decrement
// number--;

// number += 3;

// number -=4;

// number = number + 2;
// number = number - 1;

// System.out.println(number);
        
//     }
// }

///////////////////////////////////////////////////////////

// Enhanced for loop

// public class Test{

// public static void main(String[] args){

// int [] numbers = {3, 4, 5, 6, 7, 8, 9};


//     // benefit of using this for loop is having access to the index (int i = 0)
//     // we can set this for loop to start at desired index.
//     for(int i = 0; i < numbers.length; i++ ){
//         System.out.println(numbers[i]);
//     }

//     System.out.println("enhanced for loop");

//     // enhanced for loop takes all values in number and stores into number. We then print the variable number;
//     // dont have access to the index value (ex. int i = 0) will start automatically at the first index.
// for(int number : numbers) {
//     System.out.println(number);
// }

// // enhanced for loop with String
// String [] names = {"Ak", "Moe", "Has"};

// for(String name : names){
//     System.out.println(name);
// }

// System.out.println("forEach");
// Arrays.stream(numbers).forEach(System.out::println);
// }

// }

///////////////////////////////////////////////////////////

// Break and continue

public class Test{

public static void main(String[] args){

    String [] names = {"Ak", "Moe", "Has", "Anna"};

    for(String name : names){
        // if(name.equals("Has")){
        //     break; // break simply breaks out of a loop.
        // }
        // System.out.println(name);

        // example of continue
        if(name.startsWith("A")){
            continue; // will loop back up if the expression is held true. So if a name is found with "A" the continue will start back up to the top of the loop. 
            // Does "Moe" start with "A" No, so continue here will not loop back up to the top, instead will drop down and print name.
        }
        System.out.println(name);
    }
}

}