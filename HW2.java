package Home;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        double z,x,y;
        Scanner circle=new Scanner(System.in);
        System.out.println("enter x");
        x= circle.nextDouble ();
        z=3.14*(x*x);
        System.out.println(z);
        y=2*3.14*x;
        System.out.println(y);
    }
}
