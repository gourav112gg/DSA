package If_Else;

import java.util.Scanner;

public class FourdigitNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check : ");
        int num = sc.nextInt();

        if (num > 999 && num < 10000) System.out.println("Num is a four digit number");
        else System.out.println("Num is not a four digit num");
    }
}
