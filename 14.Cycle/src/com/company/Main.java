package com.company;
public class Main {
    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int b = 1;

        System.out.println(++a + b++); // 3
        System.out.println(a++ + ++b); // 5
        System.out.println(a++ + ++b - ++b);
        System.out.println(a++ - b++ + (a-b));

        // 2

    }
}




