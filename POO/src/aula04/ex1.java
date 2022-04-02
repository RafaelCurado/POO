package aula04;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma palavra, frase ou parágrafo: ");
        String str = sc.nextLine();

        System.out.println("");

        System.out.println("Frase convertida para minúsculas: " + str.toLowerCase());          
        System.out.println("Frase convertida para maiúsculas: " + str.toUpperCase());
        System.out.println("Último carater da frase:          " + str.charAt(str.length()-1)); 
        System.out.println("Os 3 primeiros carateres:         " + str.substring(0,3));
        System.out.println("Comprimento da palavra/frase:     " + str.length());
        
        sc.close();
    }
}
