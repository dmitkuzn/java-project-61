package hexlet.code;

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

    public static void main(String[] args) {
        //Printing game's menu
        printMenu();
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        Integer userChoice = -1;
        try {
            userChoice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            ;
        }
        switch (userChoice) {
            case MENU_EXIT:
                System.out.println("Good bye!!!");
                break;
            case MENU_GREETING:
                hexlet.code.Cli.userGreeting();
                break;
            case MENU_GAMEEEVEN:
                hexlet.code.Engine.startGame(GameEven.getGameGreeting(), GameEven.getGameData());
                break;
            case MENU_GAMECALC:
                hexlet.code.Engine.startGame(GameCalc.getGameGreeting(), GameCalc.getGameData());
                break;
            case MENU_GAMEGCD:
                hexlet.code.Engine.startGame(GameGCD.getGameGreeting(), GameGCD.getGameData());
                break;
            case MENU_GAMEPROGRESSION:
                hexlet.code.Engine.startGame(GameProgression.getGameGreeting(), GameProgression.getGameData());
                break;
            case MENU_GAMEPRIME:
                hexlet.code.Engine.startGame(GamePrime.getGameGreeting(), GamePrime.getGameData());
                break;
            default:
                System.out.println("Incorrect choice! Must be a number from 0 to " + MENU_GAMEPRIME + "!!!");
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
