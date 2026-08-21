package Basic_stuff;

import java.util.Scanner;

public class si {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        int p = 79, r = 5, t = 8;
        double si = p*r*t/ 100.0;
        System.out.println(si);
    }
}
