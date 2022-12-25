package com.bridgelabz;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.display();

        while (myStack.head != null) {
            myStack.pop();
            System.out.println("Updated List: ");
            myStack.display();

    }
}}
