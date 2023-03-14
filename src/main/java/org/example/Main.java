package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(seconds(5));
        System.out.println(seconds(2));
        System.out.println(seconds(3));
    }
    public static int seconds (int x) {
        return x * 60;
    }

}