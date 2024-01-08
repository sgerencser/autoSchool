package com.exceptions;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        Logic logic = new Logic();
        logic.publicCall();

        LogicWithException l2 = new LogicWithException();
        l2.publicCall();
    }
}
