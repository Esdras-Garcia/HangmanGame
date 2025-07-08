package com.github.esdrasgarcia.hangman.exception;

public class LetterAlreadyInputtedException extends RuntimeException {
    public LetterAlreadyInputtedException(String message) {
        super(message);
    }
}
