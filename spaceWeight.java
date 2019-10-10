import java.util.Scanner;

public class spaceWeight {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Hello. What is your current weight before we go?");

            double weight = sc.nextDouble();

            System.out.println();
            System.out.println("Which planet are you visiting? \n" +
                    "1. Venus \n" +
                    "2. Mars \n" +
                    "3. Jupiter \n" +
                    "4. Saturn \n" +
                    "5. Uranus \n" +
                    "6. Neptune");

            int x;
            x = sc.nextInt();

            if (x == 1) {
                System.out.println();
                System.out.println("Your weight would be " + (weight * .78) + " in Venus");
            } else if (x == 2) {
                System.out.println();
                System.out.println("Your weight would be " + (weight * .39) + " in Mars");
            } else if (x == 3) {
                System.out.println();
                System.out.println("Your weight would be " + (weight * 2.65) + " in Jupiter");
            } else if (x == 4) {
                System.out.println();
                System.out.println("Your weight would be " + (weight * 1.17) + " in Saturn");
            } else if (x ==5) {
                System.out.println();
                System.out.println("Your weight would be " + (weight * 1.05) + " in Uranus");
            } else if (x == 6){
                System.out.println();
                System.out.println("Your weight would be " + (weight * 1.23) + " in Neptune");
            }   else if (x > 6) {
                System.out.println();
                System.out.println("Where are you going?!");
        }









                            /*

            int Venus = 1;
            int Mars = 2;
            int Jupiter = 3;
            int Saturn = 4;
            int Uranus = 5;
            int Neptune = 6;

            int Venus = 1;
            int Mars = 2;
            int Jupiter = 3;
            int Saturn = 4;
            int Uranus = 5;
            int Neptune = 6;

             */




        }

        }