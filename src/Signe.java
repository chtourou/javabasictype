import java.util.Scanner;

public class Signe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x;
            System.out.println("Give x: ");

            x = scanner.nextInt();
            {
                if (x <= 0) {
                    System.out.println("negative number");
                } else {
                    System.out.println("positive number");

                }


            }

        }
    }
}
