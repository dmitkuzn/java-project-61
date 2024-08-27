package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;


public class App {

    public static void main(String[] args) {
        printMenu();
        Integer userChoice = getUserChoice();
        switch (userChoice) {
            case 0:
                System.out.println("Good bye!!!");
                break;
            case 1:
                hexlet.code.Cli.userGreeting();
                break;
            case 2:
                hexlet.code.Engine.startGame(GameEven.getGameGreeting(), GameEven.getGameData());
                break;
            case 3:
                hexlet.code.Engine.startGame(GameCalc.getGameGreeting(), GameCalc.getGameData());
                break;
            case 4:
                hexlet.code.Engine.startGame(GameGCD.getGameGreeting(), GameGCD.getGameData());
                break;
            default:
                break;
        }
        //}
    }

    public static Integer getUserChoice() {
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        try {
            return Integer.parseInt(userChoice);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect choice - must be a number!!!");
        }
        return null;
    }

    public static void printMenu() {
        System.out.println("==============MENU=============");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.println("===============================");
    }

}
