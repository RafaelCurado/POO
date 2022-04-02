package aula02;
import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de Água (Kg): ");
        Double m = sc.nextDouble();
        System.out.println("Insira a temperatura inicial (Celsius): ");
        Double ti = sc.nextDouble();
        System.out.println("Insira a temperatura final (Celsius): ");
        Double tf = sc.nextDouble();
        Double q = m*(tf-ti)*4184;
        System.out.println("A energia necessária é: " + q + " J");
        sc.close();
    }
}
