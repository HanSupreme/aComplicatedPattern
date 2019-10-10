/*

Name: Seyhan A. Cileli
contact: sey.cileli@gmail.coom

 */

import java.util.Arrays;
import java.util.Scanner;

public class letterAtATime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner to get user input
        System.out.println("Input a message: "); //message asking user to enter message

        char[] usersInput = sc.nextLine().toCharArray(); //char because we want a SINGLE character

        //split will split user message and will insert what is between double quotes

        for (int i = 0; i < usersInput.length; i++) {
            System.out.println(i + ": " + "'" + usersInput[i] + "'");

            //i = 0, and represents the starting point of the count
            //i < userinput.length is us assigning it to i's count
            //i++ will make this loop the amount of times it need to, without it will be infinite

        }

    }

}
