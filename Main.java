package main.zad3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствую тебя оооо господин!\n");
        ArrayList<String> log = new ArrayList<>();
        Scanner startGame = new Scanner(System.in);
        System.out.println("Поиграем? (yes/no?) ");
        String start = startGame.next();
        while (start.equals("yes")) {
            Scanner scsizeWord = new Scanner(System.in);
            System.out.println("Введите длину слова: ");
            int sizeWord = Integer.parseInt(scsizeWord.next());
            Scanner scmaxTry = new Scanner(System.in);
            System.out.println("Введите количество попыток: ");
            int maxTry = Integer.parseInt(scmaxTry.next());
            Scanner vybGame = new Scanner(System.in);
            System.out.println("Играем укажите вариант?: \n" +
                    "1. Цифрами \n" +
                    "2. Руссками буквами \n" +
                    "3. Английсками буквами ");
            int varGame = Integer.parseInt(vybGame.next());
            if (varGame == 1){
                Game game = new NumberGame();
                game.start(sizeWord, maxTry);
                while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                    System.out.println("Введите свой вариант: ");
                    Scanner scanner = new Scanner(System.in);
                    Answet answet = game.inputValue(scanner.nextLine());
                    log.add(String.valueOf("Быков= " + answet.bull));
                    log.add(String.valueOf("Коров= " + answet.cow));
                    log.add(String.valueOf("Количество попыток= " + answet.maxTry + "\n"));
                    System.out.println(answet);
                }
                System.out.println("Cтатус = " + game.getGameStatus());
                log.add(String.valueOf(game.getGameStatus() + "\n"));
            }
            else if (varGame == 2){
                Game game = new RussianGame();
                game.start(sizeWord, maxTry);
                while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                    System.out.println("Введите свой вариант: ");
                    Scanner scanner = new Scanner(System.in);
                    Answet answet = game.inputValue(scanner.nextLine());
                    log.add(String.valueOf("Быков= " + answet.bull));
                    log.add(String.valueOf("Коров= " + answet.cow));
                    log.add(String.valueOf("Количество попыток= " + answet.maxTry + "\n"));
                    System.out.println(answet);
                }
                System.out.println("Cтатус = " + game.getGameStatus());
                log.add(String.valueOf(game.getGameStatus() + "\n"));
            }else{
                Game game = new EnglichGame();
                game.start(sizeWord, maxTry);
                while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                    System.out.println("Введите свой вариант: ");
                    Scanner scanner = new Scanner(System.in);
                    Answet answet = game.inputValue(scanner.nextLine());
                    log.add(String.valueOf("Быков= " + answet.bull));
                    log.add(String.valueOf("Коров= " + answet.cow));
                    log.add(String.valueOf("Количество попыток= " + answet.maxTry + "\n"));
                    System.out.println(answet);
                }
                System.out.println("Cтатус = " + game.getGameStatus());
                log.add(String.valueOf(game.getGameStatus() + "\n"));
            }
            Scanner scLog = new Scanner(System.in);
            System.out.println("Показать лог игры? (yes/no?) ");
            String logSt = scLog.nextLine();
            if(logSt.equals("yes")) {
                System.out.println("Логи  игры =\n" + log);
            }
            Scanner beginGame = new Scanner(System.in);
            System.out.println("Поиграем еще? (yes/no?) ");
            String stop = beginGame.nextLine();
            if (stop.equals("no")) start = "no";
        }
        System.out.println("До свидания!");
    }
}