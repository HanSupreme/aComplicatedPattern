import java.util.Scanner;

public class seasonFromDayToMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("I will determine the season based off your input on Month and Day. " +
                "Let's start with you telling me the Month first.");

        String month = sc.nextLine();

        System.out.println("Now name me a numerical day");

        byte day = sc.nextByte();

        if (month.equalsIgnoreCase("December") && day >= 22 && day <= 30 ||
                month.equalsIgnoreCase("January") && day >= 1 && day <= 31 ||
                month.equalsIgnoreCase("February") & day >= 1 && day <= 28 ||
                month.equalsIgnoreCase("March") && day >= 1 && day <= 19) {
            System.out.println("Winter");
        } else if (month.equalsIgnoreCase("March") && day >= 20 && day <= 31 ||
                month.equalsIgnoreCase("April") && day >= 1 && day <= 30 ||
                month.equalsIgnoreCase("May") & day >= 1 && day <= 30 ||
                month.equalsIgnoreCase("June") && day >= 1 && day <= 20) {
            System.out.println("Spring");
        } else if (month.equalsIgnoreCase("June") && day >= 21 && day <= 30 ||
                month.equalsIgnoreCase("July") && day >= 1 && day <= 31 ||
                month.equalsIgnoreCase("August") & day >= 1 && day <= 31 ||
                month.equalsIgnoreCase("September") && day >= 1 && day <= 21) {
            System.out.println("Summer");
        } else if (month.equalsIgnoreCase("September") && day >= 22 && day <= 30 ||
                month.equalsIgnoreCase("October") && day >= 1 && day <= 31 ||
                month.equalsIgnoreCase("November") & day >= 1 && day <= 30 ||
                month.equalsIgnoreCase("December") && day >= 1 && day <= 20) {
            System.out.println("Fall");


        }


    }

}