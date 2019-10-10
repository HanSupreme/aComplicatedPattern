public class fibonacci {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i < 10; i++) {
            int n3 = (n1 + n2);
            System.out.println(n1);

            n1 = n2;
            n2 = n3;

        }

    }

}
