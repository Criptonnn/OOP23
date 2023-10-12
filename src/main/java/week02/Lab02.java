package week02;

import java.util.Random;
import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        //password();
        //sumThree();
        //sumNumbers();
        //printNumbersBetween();
        //powerOfTwo();
        //printText();
        //printStars(5);
        //drawPyramid(5);
        //drawPyramidReversed(5);
        //drawNumbersPyramid(5);
        //drawNumbersPyramidV2(5);
        //guessingGame();

    }

    public static void password() {
        Scanner scanner = new Scanner(System.in);
        String pwd;
        while(true) {
            System.out.print("Guess: ");
            pwd = scanner.nextLine();
            if(pwd.equals("carrot")) {
                System.out.println("Bravo majstore!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void sumThree() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        int i = 0;
        while (i < 3) {
            System.out.print("Input number: ");
            System.out.print("Enter new number: ");
            num = scanner.nextInt();
            sum += num;
            i++;
        }
        System.out.println("Sum: " + sum);
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Input number: ");
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

    public static void printNumbersBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public static void powerOfTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exponent: ");
        int x = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= x; i++) {
            sum += Math.round((Math.pow(2, i)));
        }
        System.out.println("Sum: " + sum);
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void printStars(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void drawPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawPyramidReversed(int n) {
        for(int i = n; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawNumbersPyramid(int n) {
        for(int i = 1; i <= n + 1; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void drawNumbersPyramidV2(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void guessingGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(100) + 1;
        int guesses = 0;
        while (true) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            guesses++;
            if(guess == randomNum) {
                System.out.println("Congratulations!");
                break;
            }
            if(guess > randomNum) {
                System.out.println("Your number is greater, number of guesses: " + guesses);
            }
            if(guess < randomNum) {
                System.out.println("Your number is smaller, number of guesses: " + guesses);
            }
        }
    }
}

