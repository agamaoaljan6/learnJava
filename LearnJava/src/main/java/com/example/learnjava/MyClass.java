package com.example.learnjava;

public class MyClass {

    public static void main(String[] args) {
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
    }
}
