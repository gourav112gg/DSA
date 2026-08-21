package If_Else;

import java.util.Scanner;

public class evenorodd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check:");
        int num = sc.nextInt();
        if (num%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
