

import java.util.Scanner;

public class TP01Ex03 {

    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
        digitado.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         double diagonal;
         double area;
         

      while (true) {
            System.out.println("Digite o valor da diagonal: ");

            if (scanner.hasNextDouble()) {
                diagonal = scanner.nextDouble();
                System.out.println();
                if (diagonal > 0) {
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

         
         area = (diagonal*diagonal)/2;
         
        System.out.printf("A área do quadrado é: %.2f\n", area);
         scanner.close();
         
    }
    
}
