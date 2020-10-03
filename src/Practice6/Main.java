package Practice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String colour;
        int side_a;
        int side_b;

        Scanner in = new Scanner(System.in);

        System.out.println();
        side_a=in.nextInt();
        System.out.println();
        side_b=in.nextInt();

        Rectangle rectangle = new Rectangle(side_a, side_b);

    }
}
