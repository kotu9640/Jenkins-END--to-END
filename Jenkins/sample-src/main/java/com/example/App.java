package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins Pipeline with Maven!");
        SampleApplication app = new SampleApplication();
        app.run();
    }
} 

class SampleApplication {
    public void run() {
        System.out.println("Sample Application is running...");
    }
}