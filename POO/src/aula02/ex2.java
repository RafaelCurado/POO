package aula02;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius:");
        Double celsius = sc.nextDouble();
        Double fahrenheit = celsius*1.8 + 32;
        System.out.println(fahrenheit);
        sc.close();
        
    }
}
