package If_Else;

import java.awt.*;
import java.util.Scanner;

public class profitandloss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();


        if (sp > cp) System.out.println("Profit is : " + (sp-cp));
        if (cp > sp) System.out.println("Loss is : " + (cp - sp));
        if (cp == sp) System.out.println("No Profit No loss");

        if (sp > cp) System.out.println("Profit is : " + (sp-cp));
        else if (cp > sp) System.out.println("Loss is : " + (cp - sp));
        if (cp == sp) System.out.println("No Profit No loss");
    }
}
