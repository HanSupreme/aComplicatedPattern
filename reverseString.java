import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a string to be reversed: ");
        String string = sc.nextLine();

        for (int i = 0; i < string.length() / 2; i++) {
            System.out.println(string);
            string = string.substring(0, i) + string.charAt(string.length() - (i + 1))
                    + string.substring(i + 1, string.length() - (i + 1))
                    + string.charAt(i) + string.substring(string.length() - (i));
        }

        System.out.println(string);

        sc.close();
    }
}