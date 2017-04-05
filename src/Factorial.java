import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("hello factoriel");
        Scanner scanner = new Scanner(System.in);
        int x;
        Scanner input = new Scanner(System.in);
        while (true) {
            int fact = 1;
            System.out.println("donner x: ");
            x = input.nextInt();
            if (x < 0 || x > 30) {
                System.out.println("Donner un nbre entre 0 et 30");
            } else {
                for (int i = 2; i <= x; i++) {
                    fact = fact * i;
                }

                System.out.println("Factorial: " + fact);
            }
        }
    }
}
