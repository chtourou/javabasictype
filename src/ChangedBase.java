import java.util.Scanner;

public class ChangedBase {
    public static void main(String[] args) {
        System.out.println("base 10 to 2");
        int d;
        double b;
        int i;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("give me a dicimal number positive d=");
            d = input.nextInt();


            if (d < 0) {
                System.out.println("try again");
                continue;
            }

            System.out.println("d: " + d);

            String number = "";
            while (d > 0) {
                int rest = d % 2;
                d = d / 2;
                number = number + rest;
            }

            System.out.println("Result: " + number);
        }
    }


}
