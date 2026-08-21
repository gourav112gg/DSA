package If_Else;

import java.util.Scanner;

public class absolutevalueofnum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
//        if (n>=0) System.out.println(n);
//        else System.out.println(n*-1);

        if (n<=0) n=-n;
        System.out.println(n);
    }
}
