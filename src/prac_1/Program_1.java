package prac_1;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        Scanner in = new Scanner(System.in);

        yuan = in.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println(Math.ceil(roubles));
    }
}
