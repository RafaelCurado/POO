package aula03;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
            System.out.print("Insira o mês: ");
            int mes = Helpers.readInRangeInt(1,12);
            System.out.print("Insira o ano: ");
            int ano = Helpers.readInRangeInt(0,Integer.MAX_VALUE);

            if((ano%400 == 0 || (ano%4 == 0 && ano%100 == 0)) && mes == 2) 
                System.out.println("29 dias");
            else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    System.out.println("31 dias");
                else if (mes == 2)
                    System.out.println("28 dias");
                else 
                    System.out.println("30 dias");
            }
        sc.close();
    }
}
