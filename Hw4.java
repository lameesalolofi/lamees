package Home;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
       double z,x,c,v;
        Scanner average=new Scanner(System.in);
        System.out.println("inpout number one");
        z= average.nextDouble();
        System.out.println("inpout number tow");
        x= average.nextDouble();
        System.out.println("inpout number three");
       c= average.nextDouble();
       v=(z+x+c)/3;
        System.out.println("the average =" +v);


    }
}
