import java.util.Scanner;

public class monthNameToNumberOfDays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month and I'll tell you how many days it has!");

        String userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("January")) {
            System.out.println(userInput + " has 31 days.");
        } else if (userInput.equalsIgnoreCase("February")) {
            System.out.println(userInput + "  28 days in a common year and 29 days in leap years.");
        } else if (userInput.equalsIgnoreCase("March")) {
            System.out.println(userInput + "  31 days.");
        } else if (userInput.equalsIgnoreCase("April")) {
            System.out.println(userInput + "  30 days.");
        } else if (userInput.equalsIgnoreCase("May")) {
            System.out.println(userInput + "  31 days.");
        } else if (userInput.equalsIgnoreCase("June")) {
            System.out.println(userInput + "  30 days.");
        } else if (userInput.equalsIgnoreCase("July")) {
            System.out.println(userInput + "  31 days.");
        } else if (userInput.equalsIgnoreCase("August")) {
            System.out.println(userInput + "  31 days.");
        } else if (userInput.equalsIgnoreCase("September")) {
            System.out.println(userInput + "  30 days.");
        } else if (userInput.equalsIgnoreCase("October")) {
            System.out.println(userInput + "  31 days.");
        } else if (userInput.equalsIgnoreCase("November")) {
            System.out.println(userInput + "  30 days.");
        } else if (userInput.equalsIgnoreCase("December")) {
            System.out.println(userInput + "  31 days.");
        } else {
            System.out.println("That isn't a month!");
        }
    }
}