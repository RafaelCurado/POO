package aula03;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a[] = new double[100];
        int i;
        
        for(i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            if (i != 0 && a[i] == a[0]) 
                break;
        }
        double min = a[0];
        double max = a[0];
        double sum = 0.0;

        for(int j = 0; j < i; j++) {
            if(a[j] > max) 
                max = a[j];
            else 
                min = a[j];
            sum += a[j];
        }
        double media = sum/i;

        System.out.println("Máximo: " +max);
        System.out.println("Mínimo: " +min);
        System.out.println("Total de números lidos: " +i);
        System.out.println("Soma dos números lidos: " +sum);
        System.out.println("Média: " +media);

        sc.close();
    }
}


