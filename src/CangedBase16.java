import java.util.Scanner;

public class CangedBase16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("base 10 to 16");
        int h;
        while (true) {
            System.out.println("give me a dicimal number positve h=");
            h = input.nextInt();
            boolean ishvalid = h >= 0;
            if (ishvalid) {
                String number = "";
                while (h >0) {
                    int rest = h % 16;
                    h = h / 16;
                    if (rest >= 0 && rest <= 9) {

                        number = number + rest;
                    } else if (rest == 10) {
                        number = number + "A";
                    } else if (rest == 11) {
                        number = number + "B";
                    } else if (rest == 12) {
                        number = number + "C";
                    } else if (rest == 13) {
                        number = number + "D";
                    } else if (rest == 14) {
                        number = number + "E";
                    } else if (rest == 15) {
                        number = number + "F";
                    }


                }
                System.out.println("Result: " + number);

            }

        }


    }
}
