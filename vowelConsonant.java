import java.util.Scanner;

public class vowelConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single character: ");

        String simpleInput = sc.nextLine();
        char userInput = simpleInput.charAt(0);
        simpleInput.length();

        if (userInput == 'a' || userInput == 'e' || userInput == 'i' ||
                userInput == 'o' || userInput == 'u' ||
                userInput == 'A' || userInput == 'E' || userInput == 'I' ||
                userInput == 'O' || userInput == 'U') {
            System.out.println(userInput + " is a vowel.");
        } else if (userInput >= 'a' && userInput <= 'z' || userInput >= 'A' && userInput <= 'Z') {
            System.out.println(userInput + " is a consonant");
        } else if (userInput >= 0){
            System.out.println("That's a number!");
        }

        if (simpleInput.length() > 1) {
            System.out.println("That's also not a single character!");

        }
    }
}