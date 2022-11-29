package org.example;

/**
 * exception if input is not valid
 */
public class IncorrectInputException extends Exception {

    /**
     *
     * @param errorMessage string
     */
    public IncorrectInputException(String errorMessage) {
        super(errorMessage);
    }
}
