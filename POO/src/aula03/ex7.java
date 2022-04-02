package aula03;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String res;
        int n, rnd, tentativas = 0;

        do {
            System.out.print("Adivinhe um número entre 0 e 100: ");
            n = Helpers.readInRangeInt(0, 100);
            rnd = (int)(Math.random()*99 +1);

            tentativas = 1;
            while(n != rnd) {
                if (n > rnd) {
                    tentativas++;
                    System.out.printf("Demasiado alto.. %dª tentativa: ", tentativas);
                    n = Helpers.readInRangeInt(0, 100);
                } else {
                    tentativas++;
                    System.out.printf("Demasiado baixo.. %dª tentativa: ", tentativas);            
                    n = Helpers.readInRangeInt(0, 100);
                }
            }
            System.out.println("Acertou! Tentativas:" +tentativas);
            System.out.println("Pretende continuar? Prima (S)im ");
            res = sc.next();
        } while(res.compareTo("S") == 0 || res.compareTo("Sim") == 0);
            sc.close();
    }
}