package aula03;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][16];

        System.out.println("NotaT  NotaP  Pauta");
        for (int i = 0; i < 16; i++) {
            notas[0][i] = Math.random()*19 + 1;
            notas[1][i] = Math.random()*19 + 1;
            if (notas[0][i]<7.0 || notas[1][i]<7.0)
                notas[2][i] = 66;
            else
                notas[2][i] = (int)Math.round(0.4*notas[0][i] + 0.6*notas[1][i]);
            System.out.printf("%5.1f  %5.1f  %5.0f \n",notas[0][i], notas[1][i], notas[2][i]);
        }
        sc.close();
    }
}
