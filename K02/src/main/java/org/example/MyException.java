package org.example;

public class MyException extends Exception {
    public Exception wrongInputException() {
        return new Exception("Es sind nur Zahlen erlaubt!");
    }
}
