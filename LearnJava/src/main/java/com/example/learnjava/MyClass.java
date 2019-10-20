package com.example.learnjava;

public class MyClass {


    /*
    // In Java, EVERYTHING is SPECIFIED. or else you will get a compiler error.
    // Always minimize the footprint of the code/project which leads to good code efficiency
    // Use what you only need


    // Variable == bucket in memory
    // These are all primitive types
    int age = 24;
    long weightOfPlanet = 999999999; // long is used on bigger numbers
    // 1.3, 4.4, 0.2.. decimal numbers
    float pi = 3.14f;
    // if you create float, add 'f' at the end of the number
    double pid = 3.14;
    // if you create double, you don't need to add 'f' at the end of the number
    // double is bigger than float, it's also more precise
    byte b = 127;
    // byte is a smallest type of number. It can only hold up until 127(max).
    short s = 350;
    // short is twice the byte.
    String name = "Aljan";
    // Subset of a string is char. If you use char, you need to use '' single quotes
    // you can only put 1(one) character inside '' if you put 2 or more, you will get an error
    char a = 'a';
    System.out.println("Hi my name is " + name + " I'm " + age + " years old.");
    // Boolean == True or False. Can only hold 1 value at a certain time.
    boolean isTrue = true;
    System.out.println(isTrue);


    // Basic operations -, +, *, /
    int a = 12;
    int b = 12;
    int total = b + a;
    System.out.println(total);

    // total = total + 100 is the same as total += 100;

    // Remainder % ==  "what remains.."

        Relational operators
        = assignment operator
        == comparison operator
        != NOT
        > Greater than
        < Less than
        >= Greater than or equal
        <= Less than or equal

        Logical operators
        (NEGATION)!
        (AND)&& returns false if ONE is false
        (OR) || returns true if one is true


    boolean isAged = true;
    boolean isNotAged = false;

    if (isAged && isNotAged) {
        System.out.println("Indeed!");
    } else {
        System.out.println("NOPE");
    }


    // For loops in Java
    for (int i = 0; i <10 ; i++) {
        if(i % 2 == 0) {
            System.out.println("Multiple of 2 is "+ i);
        } else {
            System.out.println("Not a multiple");
        }
    }
 */
    public static void main(String[] args) {

        // The compiler will read the code from TOP to BOTTOM
        // anotherMethod("Hello?");
        // showName();
        // int finalResult = addNumbers(4,5);
        // System.out.println(finalResult);
        // String printFn = myName("john ", "doe" );
        // System.out.println( printFn);
        String bio = showBio("John", "I was born in Winterfell", 45);
        System.out.println(bio);
    }

    public static String showBio(String name, String bio, int age) {
        String description = "My name is " + name + " and I am " + age + " years old. " + bio;
        return description;
    }


    public static int addNumbers(int a, int b) {
        int result = 0;
        result = a+b;
        return  result;
    }

    public static String myName(String firstName, String lastName) {
        String fullName;
        fullName = firstName + lastName;
        return fullName;
    }

    public static void showName() {
        System.out.println("from showname method");
        for (int i = 0; i <10 ; i++) {
            if(i % 2 == 0) {
                System.out.println("Multiple of 2 is "+ i);
            } else {
                System.out.println("Not a multiple");
            }
        }
    }

    public static void anotherMethod(String something) {
        System.out.println("Another method " + "Hello");
    }


}
