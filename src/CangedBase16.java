import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CangedBase16 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");
        map.put(6, "6");
        map.put(7, "7");
        map.put(8, "8");
        map.put(9, "9");
        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");

        int base = 13;

        Scanner input = new Scanner(System.in);
        System.out.println("base 10 to " + base);
        int value;
        while (true) {
            System.out.println("give me a dicimal number positve h=");
            value = input.nextInt();
            boolean isValueValid = value >= 0;

            if (!isValueValid) {
                System.out.println("You entered a non valid number!");
                continue;
            }

            String number = "";
            while (value > 0) {
                int rest = value % base;
                value = value / base;
                number = map.get(rest) + number;
            }
            System.out.println("Result: " + number);

        }


    }
}
