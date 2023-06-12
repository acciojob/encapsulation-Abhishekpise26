package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to 'name' directly and printing it
        // This will result in an error because 'name' is a private member variable
        // and cannot be accessed directly from outside the class
        // obj.name = "John"; // Uncommenting this line will cause an error

        // Task 6: Set a value to 'name' using setter function and access it using getter function
        obj.setName("Abhishek");
        obj.getName();

    }
}
