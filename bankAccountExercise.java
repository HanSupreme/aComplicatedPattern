/*

Name: Seyhan A. Cileli
contact: sey.cileli@gmail.coom

 */

import java.lang.reflect.Array;

public class bankAccountExercise {

    public static void main(String[] args) {

        storeTransactions();

    }


    public static void storeTransactions() {

        //the above is a Method Header. PS = modifier, VOID(INT, String = datatype), StoreTransactions = "Signature"

        int[] credits = new int[1000];
        int amount;

        int i = 0;

        do {
            amount = (int) (1 + Math.random() * 500);
            credits[i] = amount;
            i++;

        } while (i < 1000); //{

            for (int j = 1; j < 1000; j++) {
                System.out.println(j + ": " + credits[j]);


            }
        }

        }