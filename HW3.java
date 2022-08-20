package Home;

import java.util.Scanner;

public class HW3 { public static void main(String[] args) {
    double z,x,y,c;
    Scanner circle=new Scanner(System.in);
    System.out.println("enter x");
    x= circle.nextDouble ();
    System.out.println("enter c");
    c= circle.nextDouble ();
    z=c*x;
    System.out.println(z);
    y=2*c+2*x;
    System.out.println(y);
}
}
