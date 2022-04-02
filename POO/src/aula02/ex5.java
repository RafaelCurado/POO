package aula02;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Velocidade v1: ");
        Double v1 = sc.nextDouble();
        System.out.println("Distância d1 ");
        Double d1 = sc.nextDouble();
        System.out.println("Velocidade v2: ");
        Double v2 = sc.nextDouble();
        System.out.println("Distância d2 ");
        Double d2 = sc.nextDouble();

        Double d = d1+d2;
        Double t = d1/v1 + d2/v2;
        Double v = d/t;
        System.out.print("Velocidade média: " +v);
        sc.close();
    }
}
