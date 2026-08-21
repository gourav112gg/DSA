package Basic_stuff;

import java.util.Scanner;

public class squareofnum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        double num = sc.nextDouble();
        double square = num * num;
        System.out.print("Square of num is: ");
        System.out.print(square);
    }
}
