import java.util.Scanner;

public class dayOfTheWeek {

    public static void main(String[] args) {

        int Monday = 1;
        int Tuesday = 2;
        int Wednesday = 3;
        int Thursday = 4;
        int Friday = 5;
        int Saturday = 6;
        int Sunday = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1-7");

        int userInputNum = sc.nextInt();

        if (userInputNum == 1) {
            System.out.println("Weekday 1 is Monday!");
        } else if (userInputNum == 2) {
            System.out.println("Weekday 2 is Tuesday!");
        } else if (userInputNum == 3) {
            System.out.println("Weekday 3 is Wednesday!");
        } else if (userInputNum == 4) {
            System.out.println("Weekday 4 is Thursday!");
        } else if (userInputNum == 5) {
            System.out.println("Weekday 5 is Friday!");
        } else if (userInputNum == 6) {
            System.out.println("Weekend 6 is Saturday!");
        } else if (userInputNum == 7) {
            System.out.println("Weekend 7 is Sunday!");
        } else if (userInputNum > 8) {
            System.out.println("There are only 7 days out of the week!");
        }

    }
}
