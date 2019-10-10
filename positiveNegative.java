import java.util.Scanner;

public class positiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number and I'll tell you if it's positive or negative");

        double userNumber = sc.nextDouble();

        if (userNumber > 0) {
            System.out.println("The number " + userNumber + " is positive");
        } else if (userNumber < 0) {
            System.out.println("The number " + userNumber + " is negative");
        }
    }
}