import java.util.Scanner;

public class specificLegalProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what's your name?");

        String name = sc.nextLine();

        System.out.println("Hi " + name + ". Before we start, how old are you?");

        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("You're too young to drive");
        } else if (age < 18) {
            System.out.println("You're too young to vote.");
        } else if (age < 25) {
            System.out.println("You're too young to rent a car.");
        } else {
            System.out.println("You can do anything that's legal!");
        }

    }

}
