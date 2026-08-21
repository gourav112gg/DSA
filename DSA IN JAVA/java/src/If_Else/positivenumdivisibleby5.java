package If_Else;

import java.util.Scanner;

public class positivenumdivisibleby5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive num: ");
        int num = sc.nextInt();
        if(num>0){
            if (num%5==0) { System.out.println("Num is positive as well as divisible by 5");}
            System.out.println("Num is positive only");
        }
        else System.out.println("Num is negative");
    }
}
