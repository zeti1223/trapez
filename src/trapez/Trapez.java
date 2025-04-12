package trapez;

import java.util.Scanner;
public class Trapez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();
        System.out.println("m: ");
        double m = sc.nextDouble();
        double area = (a+c)/2*m;
        System.out.println("A trapez terulete: " + area);


    }
    
}
