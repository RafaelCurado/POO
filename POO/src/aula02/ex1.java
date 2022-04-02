package aula02;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Distância em Km:");
        Double km = sc.nextDouble();
        Double miles = km/1.609;
        System.out.println(miles);
        sc.close();
    }
}
