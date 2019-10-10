import java.util.Scanner;

public class readsDouble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        double number = sc.nextDouble();
        System.out.println();

        if (number == 0) {
            System.out.println("You entered zero");
        } else if (number < 0) {
            System.out.println("Your number " + number + " is negative");
        } else if (number > 0) {
            if(number > 100000)
            {
                System.out.println(number + " is a large number!");
            } else {
                System.out.println("Your number " + number + " is positive");
            }

        } else if (number < .1) {
            System.out.println("Whoa! your number " + number + " is small");
        }

    }
}
