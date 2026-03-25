
import java.util.*;


public class TP01Ex15 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
   15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). */
    
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
        double CotacaoDolar;
        double Dolares;
        double Reais;

                  
         while (true) {
        System.out.println("Digite o valor da Cotação do dólar: ");

            if (scanner.hasNextDouble()) {
        CotacaoDolar = scanner.nextDouble();
                System.out.println();
                         if (CotacaoDolar > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Cotação Inválida");
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
           System.out.println("Digite uma quantia em dólares: ");

            if (scanner.hasNextDouble()) {
        Dolares = scanner.nextDouble();
                System.out.println();
                         if (Dolares >= 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Valor Inválido");
                    System.out.println();
                }
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
                            
        
        
        
        Reais = CotacaoDolar * Dolares;
        
        System.out.printf("Quantia em Reais : R$%.2f%n\"", Reais);

                
    }
    
}
