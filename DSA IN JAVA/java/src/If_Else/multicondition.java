package If_Else;

import java.util.Scanner;

public class multicondition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check : ");
        int n = sc.nextInt();
        if (n%5==0 && n%3==0) System.out.println("Divisible by 5 and 3");
        else if (n%5==0) System.out.println("Divisible by 5");
        else if (n%3==0) System.out.println("Divisible by 3");
        else System.out.println("Not divisble by 5 and 3");
    }
}
