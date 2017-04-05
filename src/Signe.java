import java.util.Scanner;

public class Signe {
    public static void main(String[] args) {
        System.out.println("signe");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x;
            System.out.println("donner x: ");

            x = scanner.nextInt();
            {
                if (x <= 0) {
                    System.out.println("negativ number");
                } else {
                    System.out.println("positiv number");

                }


            }

        }
    }
}
