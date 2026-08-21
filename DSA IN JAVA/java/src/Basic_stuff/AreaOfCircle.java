package Basic_stuff;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        // Area = pi * r * r
        Scanner sc = new Scanner(System.in); // inputs lene ke liye
        // scanner class hai
        // sc ek object hai
        // system.in ek specialized sub-class hai
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
