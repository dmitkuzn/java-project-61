package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;


public class App {

    static final int MENU_EXIT = 0;
    static final int MENU_GREETING = 1;
    static final int MENU_GAMEEEVEN = 2;
    static final int MENU_GAMECALC = 3;
    static final int MENU_GAMEGCD = 4;
    static final int MENU_GAMEPROGRESSION = 5;
    static final int MENU_GAMEPRIME = 6;
    static final int MENU_GAME = 100000;

    public static <List> void main(String[] args) {
        //Printing game's menu
        printMenu();
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        Integer userChoice = -1;
        try {
            userChoice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Your choice must be a number!!!");
            return;
        }
        var gameQuestions = new ArrayList<String>();
        var gameAnswers = new ArrayList<String>();
        switch (userChoice) {
            case MENU_EXIT:
                System.out.println("Good bye!!!");
                break;
            case MENU_GREETING:
                hexlet.code.Cli.userGreeting();
                break;
            case MENU_GAMEEEVEN:
                GameEven.getGameData(gameQuestions, gameAnswers);
                hexlet.code.Engine.startGame(GameEven.getGameGreeting(), gameQuestions, gameAnswers);
                break;
            case MENU_GAMECALC:
                GameCalc.getGameData(gameQuestions, gameAnswers);
                hexlet.code.Engine.startGame(GameCalc.getGameGreeting(), gameQuestions, gameAnswers);
                break;
            case MENU_GAMEGCD:
                GameGCD.getGameData(gameQuestions, gameAnswers);
                hexlet.code.Engine.startGame(GameGCD.getGameGreeting(), gameQuestions, gameAnswers);
                break;
            case MENU_GAMEPROGRESSION:
                GameProgression.getGameData(gameQuestions, gameAnswers);
                hexlet.code.Engine.startGame(GameProgression.getGameGreeting(), gameQuestions, gameAnswers);
                break;
            case MENU_GAMEPRIME:
                GamePrime.getGameData(gameQuestions, gameAnswers);
                hexlet.code.Engine.startGame(GamePrime.getGameGreeting(), gameQuestions, gameAnswers);
                break;
            default:
                System.out.println("Must be a number from 0 to " + MENU_GAMEPRIME + "!!!");
                break;
        }
    }

    public static void printMenu() {
        System.out.println("==============MENU=============");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(MENU_GREETING + " - Greet");
        System.out.println(MENU_GAMEEEVEN + " - Even");
        System.out.println(MENU_GAMECALC + " - Calc");
        System.out.println(MENU_GAMEGCD + " - GCD");
        System.out.println(MENU_GAMEPROGRESSION + " - Progression");
        System.out.println(MENU_GAMEPRIME + " - Prime");
        System.out.println(MENU_EXIT + " - Exit");
        System.out.println("===============================");
    }

}
