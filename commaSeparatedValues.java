import java.util.Scanner;

public class commaSeparatedValues {

    public static void main(String[] args) {

        // Comma Separated Values

        Scanner sc = new Scanner(System.in); //scanner to get user input
        System.out.println("Input multiple words separated by commas"); //message asking user to enter message

        String[] usersInput = sc.nextLine().split(", "); //scanner assigned to user input

        //split will split user message and will insert what is between double quotes

        for (int i=0; i < usersInput.length; i++) {
            System.out.println(usersInput[i]);

            //

        }


    }


}
