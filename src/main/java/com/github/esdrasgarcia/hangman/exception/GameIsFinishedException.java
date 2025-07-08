package com.github.esdrasgarcia.hangman.exception;

public class GameIsFinishedException extends RuntimeException {
    public GameIsFinishedException(String message) {
        super(message);
    }
}
