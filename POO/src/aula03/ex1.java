package aula03;
import java.util.Scanner;

public class ex1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        System.out.print("Nota da componente prática: ");
        double notaP = Helpers.readInRangeDouble(0.0, 20.0);
        
        System.out.print("Nota da componente teórica: ");
        double notaT = Helpers.readInRangeDouble(0.0, 20.0);

        if (notaP<7.0 || notaT<7.0) 
            System.out.println("Nota final: 66 (reprovado por nota minima)");
        else {
            int notaF = (int)Math.round(0.4*notaT + 0.6*notaP);
            System.out.printf("Nota final: " +notaF);
        }        

        sc.close();
    }
}
