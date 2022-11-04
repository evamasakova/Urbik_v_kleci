package com.company;

import java.util.Scanner;

public class Dialog {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private Scanner scanner = new Scanner(System.in);


    public void welcome(String gameName, double version, String author) {
        System.out.println(ANSI_CYAN);
        System.out.println("Vítejte ve hře ");

        System.out.println("----------------------");
        System.out.println(ANSI_RESET);
        System.out.println(gameName + " v" + ANSI_CYAN + version);
        System.out.println("----------------------");
        System.out.println(ANSI_RESET);
        System.out.println("Vytvořila " + ANSI_BLUE + author);
        System.out.println(ANSI_RESET);
    }

    public void say(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public void say(String sentence, String color) {
        switch (color) {
            case "black" -> System.out.print(ANSI_BLACK);
            case "red" -> System.out.print(ANSI_RED);
            case "blue" -> System.out.print(ANSI_BLUE);
            case "cyan" -> System.out.print(ANSI_CYAN);
            case "purple" -> System.out.print(ANSI_PURPLE);
            case "green" -> System.out.print(ANSI_GREEN);
            case "white" -> System.out.print(ANSI_WHITE);
            case "yellow" -> System.out.print(ANSI_YELLOW);
        }
        say(sentence);
        System.out.print(ANSI_RESET);
    }

    public String userInput(){
        return scanner.nextLine();
    }
}
