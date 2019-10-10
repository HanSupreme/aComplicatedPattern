import java.util.Scanner;

public class greatestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first number?");

        int firstNum = sc.nextInt();

        System.out.println(); //this is to give separation when printed in terminal
        System.out.println("What is your second number?");

        int secondNum = sc.nextInt();

        System.out.println();
        System.out.println("What is your third number?");

        int thirdNum = sc.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println();
            System.out.println("Your first number " + firstNum + " is the greatest.");
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println();
            System.out.println("Your second number " + secondNum + " is the greatest.");
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println();
            System.out.println("Your third number " + thirdNum + " is the greatest.");
        }
    }

}
