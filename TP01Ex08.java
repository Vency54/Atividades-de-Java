
import java.util.Scanner;

public class TP01Ex08 {


     /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
      dois metros e que um quilômetro possui mil metros, fazer um programa para
      converter milhas marítimas em quilômetros.*/
    
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       double milhas;
       double quilometros;
       
               while (true) {
        System.out.print("Digite a quantidade de milhas marítimas: ");

            if (scanner.hasNextDouble()) {
        milhas = scanner.nextDouble();
                System.out.println();
         if (milhas > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Apenas valores maiores que 0.");
                    System.out.println();
                }
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
       
               
        quilometros = milhas * 1.852;

        System.out.printf("Equivalente em quilômetros: %.2f km \n" , quilometros);

        scanner.close();
    }
    
}
