package aula03;
import java.util.Scanner;


public class Helpers {
    public static final Scanner sc = new Scanner(System.in);

    public static Double readInRangeDouble(Double min, Double max) {
        double n;
        while(true) {
            if(!sc.hasNextDouble()) {
                System.out.println("Error: Invalid Input!");
                sc.next();
                continue;
            }
            n = sc.nextDouble();
            if (n<min || n>max) {
                System.out.println("Error: Number not in range!");
                continue;
            }
            else 
                break;
        }
        return n;
    }
    public static int readInRangeInt(int min, int max) {
        int n;
        while(true) {
            if(!sc.hasNextInt()) {
                System.out.println("Error: Invalid Input!");
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n<min || n>max) {
                System.out.println("Error: Number not in range!");
                continue;
            }
            else 
                break;
        }
        return n;
    }
}

