
import java.util.Scanner;

public class TP01Ex06 {


    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
      digitados.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        
        while (true) {
        System.out.println("Digite o primeiro número: ");

            if (scanner.hasNextDouble()) {
          n1 = scanner.nextDouble();
                System.out.println();
                 break;
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
        
                while (true) {
        System.out.println("Digite o segundo número: ");

            if (scanner.hasNextDouble()) {
        n2= scanner.nextDouble(); 
                System.out.println();
                    break;
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
        
        while (true) {
        System.out.println("Digite o terceiro número: ");

            if (scanner.hasNextDouble()) {
        n3= scanner.nextDouble(); 
                System.out.println();
                    break;

        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
        
        while (true) {
        System.out.println("Digite o quarto número: ");

            if (scanner.hasNextDouble()) {
        n4= scanner.nextDouble(); 
                System.out.println();

                    break;

            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }

        media = (n1 + n2 + n3+ n4)/4;
        
        System.out.printf("Média aritmética: %.2f\n", media);
        
        scanner.close();
        
        
    }
    
}
