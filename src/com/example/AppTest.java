package com.example;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("Running Native Unit Tests...");

        int result = App.add(5, 10);

        if (result == 15) {

            System.out.println(
                "Test Passed: App.add(5,10) returned 15."
            );

        } else {

            System.err.println(
                "Test Failed: App.add(5,10) did not return 15!"
            );

            System.exit(1);
        }
    }
}