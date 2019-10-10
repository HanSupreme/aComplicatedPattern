import java.util.Scanner;

public class halvingMachine {

    private static Scanner intNum;

    public static void main(String[] args) {

        intNum = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter an Odd or Even number and watch magic.");

        int inputInt = intNum.nextInt();

        while(inputInt!=1)
        {
            if (inputInt %2 == 1) {
                System.out.println();
                inputInt=(inputInt+1)/2;
                System.out.println("New number " + inputInt);
            } else if (inputInt %2 == 0) {
                System.out.println();
                inputInt=(inputInt)/2;
                System.out.println("New Result: " + inputInt);

            }

        }

    }
}
