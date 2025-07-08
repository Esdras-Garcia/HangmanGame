package com.github.esdrasgarcia.hangman;

import com.github.esdrasgarcia.hangman.exception.GameIsFinishedException;
import com.github.esdrasgarcia.hangman.exception.LetterAlreadyInputtedException;
import com.github.esdrasgarcia.hangman.model.HangmanChar;
import com.github.esdrasgarcia.hangman.model.HangmanGame;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        var letter = Stream.of(args)
                .map(a -> a.toLowerCase().charAt(0))
                .map(HangmanChar::new).toList();
        System.out.println(letter);
        var hangmanGame = new HangmanGame(letter);

        System.out.println("Bem-vindo ao jogo da forca! Tente adivinhar a palavra.");
        System.out.println(hangmanGame);

        var option = -1;
        while (true) {
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Informar uma letra");
            System.out.println("2 - Verificar o status do jogo");
            System.out.println("3 - Sair do jogo");

            option = scanner.nextInt();
            switch (option) {
                case 1 -> inputCharacter(hangmanGame);
                case 2 -> showGameStatus(hangmanGame);
                case 3 -> {
                    System.out.println("Saindo do jogo. Até mais!");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void showGameStatus(HangmanGame hangmanGame) {
        System.out.println(hangmanGame.getHangmanGameStatus());
        System.out.println(hangmanGame);
    }

    private static void inputCharacter(HangmanGame hangmanGame) {
        System.out.println("Informe uma letra: ");
        var character = scanner.next().charAt(0);
        try {
            hangmanGame.inputCharacter(character);
        } catch (LetterAlreadyInputtedException e) {
            System.out.println(e.getMessage());
            System.out.println(hangmanGame);
        } catch (GameIsFinishedException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println(hangmanGame);
    }
}
