package mypackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 through 10");

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter a number not string");
        }
        int userInput = sc.nextInt();
        inputANum(sc, userInput);
        
    }

    public static void inputANum(Scanner sc,int userNumber) {
        int num = userNumber;
        while (true) {
            if ((num < 1) || (num > 10)) {
                System.out.println("You made a mistake try again.Valid numbers are from 1 to 10");
                num = sc.nextInt();
            } else {
                System.out.println("Great you choose a valid number");
                System.out.println("You choose " + num);
                break;
            }
        }
        sc.close();

    }
}



