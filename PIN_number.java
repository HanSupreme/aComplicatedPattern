import java.util.Scanner;

public class PIN_number {

    public static void main(String[] args) {

        System.out.println("Welcome."); //welcome the user

        Scanner sc = new Scanner(System.in); //scanner to get user input
        System.out.println("Enter PIN Number: "); //asking user to enter pin

        int userInput = sc.nextInt(); //assigning scanner to userinput

        while (userInput != 4501 ) { //if it is NOT equal to this, ask below

           System.out.println("INCORRECT PIN. PLEASE TRY AGAIN");
           System.out.println("Enter PIN Number: ");

            userInput = sc.nextInt(); //scanner to get user to try again

            }

        System.out.println("PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE.");

        //outside loop to end loop when user finally enters correct pin

    }

}