import java.util.Scanner;

public class nameThatShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number from 3 to 10 and I'll name that shape!");

        int userNumber = sc.nextInt();

        if (userNumber < 3) {
            System.out.println("Error!");
        }

        if (userNumber == 3) {
            System.out.println(userNumber + " sides = Triangle!");
        } else if (userNumber == 4) {
            System.out.println(userNumber + " sides = Quadrilateral!");
        } else if (userNumber == 5) {
            System.out.println(userNumber + " sides = Pentagon!");
        } else if (userNumber == 6) {
            System.out.println(userNumber + " sides = Hexagon!");
        } else if (userNumber == 7) {
            System.out.println(userNumber + " sides = Heptagon!");
        } else if (userNumber == 8) {
            System.out.println(userNumber + " sides = Octagon!");
        } else if (userNumber == 9) {
            System.out.println(userNumber + " sides = Nonagon!");
        } else if (userNumber == 10) {
            System.out.println(userNumber + " sides = Decagon!");
        } else {
            System.out.println("I said 3 through 10!");
        }

    }
}
