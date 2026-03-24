
import java.util.Scanner;

public class TP01Ex10 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
         exibir sua temperatura equivalente em Fahrenheit */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius;
        double fahrenheit;
        
                                  while (true) {
        System.out.println("Digite a temperatura em celsius: ");

            if (scanner.hasNextDouble()) {
        celsius = scanner.nextDouble();
                System.out.println();
                    break;
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
       
        
        
        fahrenheit = celsius * 1.8 + 30;
        
        System.out.printf("Conversão para fahrenheit: %.2f °F \n" , fahrenheit);
        
        scanner.close();
        
    }
    
}
