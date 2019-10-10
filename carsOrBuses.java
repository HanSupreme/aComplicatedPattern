import java.util.Scanner;

public class carsOrBuses {
    public static void main(String[] args) {

        int people = 38;
        int cars = 29;
        int buses = 17;

        if (cars > people) {
            System.out.println("We should take the cars"); //if this doesn't execute, it'll go to the next code
        } else if (cars < people) { //if this doesn't execute, it'll continue to go on
            System.out.println("We shouldn't take the cars.");
        } else if (cars == people) { //it'll continue until it finds it's match
            System.out.println("We can't decide");
        }  if (buses > cars) {
            System.out.println("That's too many buses!");
        } else if (buses < cars) {
            System.out.println("Maybe we should take the buses.");
        } if (buses == cars) {
            System.out.println("We can't decide");
        } if (people > buses) { //I removed the "else" and it made no difference
            System.out.println("Alright, let's just take the buses!");
        } else System.out.println("Let's just take the cars!");

        //else is used when none of the above is true and the loop will finally come to an end

    }
}
