import java.util.Scanner;

public class CalculationSurface {
    public static void main(String[] args) {
        System.out.println("calcul surface");
        Scanner input = new Scanner(System.in);
        int x;
        float l;
        float w;
        float p;
        float R;
        while (true) {
            System.out.println("(x=1: circle), (x=2: rectangle),(x=3: square)" +
                    "give me x=");
            x = input.nextInt();
            if (x != 1 && x != 2 && x != 3)
                System.out.println("try again");
            else {
                if (x == 1)


                {
                    System.out.println("circle of radius positive R=");
                    R = input.nextFloat();

                    if (R < 0) {
                        System.out.println("try again R=");
                    } else {
                        System.out.println("Air of circle:" + 3.14 * R * R);

                        System.out.println("perimeters circle:" + 3.14 * R);
                    }


                } else if (x == 2) {


                    System.out.println("length positive l=");
                    l = input.nextInt();
                    if (l < 0) {
                        System.out.println("try again l=");


                    } else {
                        System.out.println("Width positive w=");
                        w = input.nextInt();
                        if (w < 0) {
                            System.out.println("try again w=");


                        } else {
                            System.out.println("Air of rectangle:" + l * w);

                            System.out.println("perimaitre of rectangle:" + (l + w) * 2);


                        }


                    }


                } else {
                    if (x == 3) {

                        System.out.println("length positive p=");
                        p = input.nextFloat();
                        if (p < 0) {
                            System.out.println("try again");


                        } else {
                            System.out.println("air of square:" + p * p);
                            System.out.println("perimaitre of square:" + 4 * p);
                        }


                    }


                }

            }


        }


    }
}