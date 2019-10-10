public class peopleCatsDogs {

    public static void main(String[] args) {

        int people = 10; //deleted the values so that no output is given
        int cats = 9;
        int dogs = 38;

        System.out.println();

        if (people < cats) { //if there are less people than cats, then print this statement
            System.out.println("Too many Cats! The world is doomed!");
        } else if (people > cats) { //if there are more people than cats, then print this statement
            System.out.println("Too few cats! The world is saved for another day!");
        }

        System.out.println();
        if (people < dogs) { //if more dogs than people, print the statement below
            System.out.println("The world is drooled on!");
        } else if (people > dogs) { //if more people than dogs, then print this statement below
            System.out.println("The world is dry!");
        }
    }
}
