package aula04;
import java.util.Scanner;


public class ex4 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mês: ");
        int mes = readInRangeInt(1, 12);
        System.out.print("\nAno: ");
        int ano = readInRangeInt(0, Integer.MAX_VALUE);
        System.out.print("\nDia (1 = Segunda, 2 = Terça, ...): ");
        int dia = readInRangeInt(1, 7);

        System.out.println();
        
        printCalendar(mes, ano, dia);

        sc.close();
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



    public static int diasDoMes(int mes, int ano) {
        int dias = 0;
        
        if((ano%400 == 0 || (ano%4 == 0 && ano%100 == 0)) && mes == 2) 
            dias = 29;    
            else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    dias = 31;
                else if (mes == 2)
                    dias = 28;
                else 
                    dias = 30;
            }
        return dias;
    }



    public static void printCalendar(int mes, int ano, int diaInicio) {
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int[] dias = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

        System.out.printf("   %s %d\n",meses[mes-1],ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for(int i = 1; i <= diaInicio; i++) {
            if(diaInicio == 7) break;
            System.out.print("   ");
        }

        for(int i = 0; i<diasDoMes(mes, ano); i++) {
            System.out.printf("%2d " ,dias[i]++);
            diaInicio++;
            if(diaInicio % 7 == 0) {
                System.out.println();  
            }
        }
    }
}