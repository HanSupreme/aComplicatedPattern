import java.util.Scanner;

public class nameThatTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers and I will name that triangle");

        int inputFirst = sc.nextInt();

        System.out.println("Input second number: ");

        int inputSecond = sc.nextInt();

        System.out.println("Input third number: ");

        int inputThird = sc.nextInt();

        if (inputFirst == inputSecond && inputFirst == inputThird || inputSecond == inputFirst && inputSecond == inputThird
        || inputThird == inputFirst && inputThird == inputSecond) {
            System.out.println("Equilateral Triangle");
        } else if (inputFirst == inputSecond || inputFirst == inputThird || inputSecond == inputThird) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene");

            }
        }
    }
