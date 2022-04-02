package aula02;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tempo em segundos: ");
        int total = sc.nextInt();
        
        int ss = total % 60;
        int mm = total / 60;
        int hh = mm / 60;
        mm = mm % 60;

        System.out.printf("%02d:%02d:%02d" ,hh,mm,ss);
        sc.close();
    }
}
