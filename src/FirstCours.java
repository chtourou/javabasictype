import java.util.Scanner;

public class FirstCours {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println("Donner X: ");
        x = scanner.nextInt();
        System.out.println("Donner Y: ");
        y = scanner.nextInt();

        z = x + y;

        System.out.println("The the result is: " + z);
    }
}
