package aula04;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String str = sc.nextLine();

        String acro = "";
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3)
                acro += words[i].charAt(0);
        }

        System.out.print(acro);
        sc.close();
    }
}
