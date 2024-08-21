package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userGreeting() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.nextLine();
        System.out.println("Hello, " + UserName + "!");
    }
}
