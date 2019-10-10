import java.util.Scanner;

public class aComplicatedPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many '*' rows would you like to see?");

        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
