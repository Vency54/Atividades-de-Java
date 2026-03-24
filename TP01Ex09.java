

import java.util.Scanner;

public class TP01Ex09 {

     /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
       valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tensao;
        double resistencia;
        double corrente;
        
               
               while (true) {
        System.out.println("Digite o valor da resistência: ");

            if (scanner.hasNextDouble()) {
        resistencia = scanner.nextDouble();
                System.out.println();
                  if (resistencia > 0) {
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
       
                           while (true) {
        System.out.println("Digite o valor da corrente: ");

            if (scanner.hasNextDouble()) {
        corrente = scanner.nextDouble();
                System.out.println();
                    if (corrente >= 0) {
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
       
        
        
        
        
        tensao = resistencia * corrente;
        
        System.out.printf("Valor da tensão do circuito: %.2f volts \n", tensao);
        
        scanner.close();
    }
    
}
