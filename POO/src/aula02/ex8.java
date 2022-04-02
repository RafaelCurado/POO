package aula02;
import java.util.Scanner;
import java.lang.Math;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("    /|");
        System.out.println("   / |");
        System.out.println("H /  |B");
        System.out.println(" /   |");
        System.out.println("/____|");
        System.out.println("   A  ");
        System.out.println("Insira o comprimento do cateto A: ");
        Double a = sc.nextDouble();
        System.out.println("Insira o comprimento do cateto B: ");
        Double b = sc.nextDouble();
        
        Double h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("Comprimento da hipotenusa: %.2f" ,h);
        


        sc.close();
    }
}
