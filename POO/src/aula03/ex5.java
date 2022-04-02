package aula03;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = 0.0;
        
        do {
            System.out.print("Montante investido: ");
            amount = Helpers.readInRangeInt(0, Integer.MAX_VALUE);
        } while(amount%1000 != 0);
        
        System.out.print("Taxa de juro mensal: ");
        double tax = Helpers.readInRangeDouble(0.0,5.0);

        for (int i = 1; i <= 12; i++) {
            amount = amount + amount*tax/100;
            System.out.printf("Valor %dº mês: %.2f $ \n",i,amount);
        }
        sc.close();
    }
}
