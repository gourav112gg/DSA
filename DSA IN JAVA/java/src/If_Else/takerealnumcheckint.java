package If_Else;

import java.util.Scanner;

public class takerealnumcheckint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real num: ");
//        double num = sc.nextDouble();
//        if (num % 1 == 0) sout ('is an integer);
//        if (num==(long)num) System.out.println("It is a integer");
        double n = sc.nextDouble();
        double x = (int)n;
        // if (n-x > 0)
        // n (double); x (int) if there subtraction is double then also the zero is considered as double then the num will not be a integer
        if (n-(int)n > 0) System.out.println("Not an integer");
        else System.out.println("Is an int");
    }
}
