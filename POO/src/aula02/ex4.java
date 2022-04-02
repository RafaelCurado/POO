package aula02;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Insira o montante investido ($): ");
        Double montante = sc.nextDouble();
        System.out.println("Insira a taxa de juro mensal (%): ");
        Double taxa = sc.nextDouble()/100;

        for(int i = 0; i < 3 ; i++) {
            montante += montante*taxa;
        }

        System.out.println("Valor ao fim de 3 meses: " +montante);
        sc.close();    
    }
}
