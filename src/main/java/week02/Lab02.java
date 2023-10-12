package week02;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        //password();
        //sumThree();
        //sumNumbers();

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



}
