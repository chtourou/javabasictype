import sun.util.resources.cldr.st.CalendarData_st_LS;

import java.util.Random;
import java.util.Scanner;

public class GameToGuess {


    public static void main(String[] args) {


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int nombre_deviner = rand.nextInt(100)+1;

        int nombre_entrer=0;
        System.out.println("entrer un nombre entre 1 et 100");

        while (nombre_entrer != nombre_deviner ) {
             nombre_entrer = scan.nextInt();
            if (nombre_entrer < nombre_deviner) {
                System.out.println("le nombre donner est plus petit que le demandé");
            } else {
                if (nombre_entrer > nombre_deviner) {
                    System.out.println("le nombre donner est plus grand que le demandé");
                } else {
                    System.out.println("félicitation!");
                }
            }


        }

    }


}
