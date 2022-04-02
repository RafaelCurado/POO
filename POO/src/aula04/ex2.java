package aula04;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escreva uma frase: ");
        String str = sc.nextLine();

        System.out.println("Número de digitos: " +countDigits(str));
        System.out.println("Número de espaços: " +countSpaces(str));
        System.out.println("Contém apenas minúsculas? " +onlyLowerCase(str));
        System.out.println(rmWhiteSpaces(str));
        System.out.println("É palindromo? " +isPalindrome(str));


        sc.close();
    }




    public static int countDigits(String s) {
        int digits = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')     
                digits++;
        }
        return digits;
    }

    public static int countSpaces(String s) {
        int spaces = 0;
        
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == ' ')
                spaces++;
        }
        return spaces;
    }

    public static boolean onlyLowerCase(String s) {
        int upper = 0;
        
        for(int i = 0; i < s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i))) 
                upper++;
        }
        return (upper == 0);
    }

    public static String rmWhiteSpaces(String s) {
        return s.replaceAll("[ ]+", " ");        
    }

    public static boolean isPalindrome(String s) {
        int j = s.length()-1;

        for(int i = 0; i < s.length()/2 ; i++) {
            if(s.charAt(i) != s.charAt(j)) 
                return false;
            j--;
        }
        return true;
    }
}
