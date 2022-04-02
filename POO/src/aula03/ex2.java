package aula03;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int n = Helpers.readInRangeInt(0, Integer.MAX_VALUE);

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
