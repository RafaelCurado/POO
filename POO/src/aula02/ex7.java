package aula02;
import java.util.Scanner;
import java.lang.Math;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Abcissa p1: ");
        Double x1 = sc.nextDouble();
        System.out.print("Ordenada p1: ");
        Double y1 = sc.nextDouble();
        System.out.print("Abcissa p2: ");
        Double x2 = sc.nextDouble();
        System.out.print("Ordenada p2: ");
        Double y2 = sc.nextDouble();

        System.out.printf("\np1: (%s , %s)",x1,y1);
        System.out.printf("\np2: (%s , %s)",x2,y2);

        double x = x1-x2;
        double y = y1-y2;
        double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        
        System.out.printf("\nDistância p1-p2: %.2f",d);
        sc.close();
    }
}
