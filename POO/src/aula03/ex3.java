package aula03;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro positivo: ");
        int n = Helpers.readInRangeInt(2, Integer.MAX_VALUE);

        if (n == 2) {
            System.out.println("É primo!");
            sc.close();
            return;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Não é primo!");
                sc.close();
                return;
            }
            else 
                continue;
        }
        System.out.println("É primo!");
        sc.close();
    }
}
