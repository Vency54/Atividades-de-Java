
import java.util.Scanner;


public class TP01Ex07 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
      digitados.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double media;
        
             
        while (true) {
        System.out.print("Digite o primeiro número: ");

            if (scanner.hasNextDouble()) {
        num1 = scanner.nextDouble();
                System.out.println();
                if (num1 > 0) {
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
        System.out.print("Digite o segundo número: ");

            if (scanner.hasNextDouble()) {
         num2 = scanner.nextDouble();
                System.out.println();
           if (num2 > 0) {
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
        


         media = Math.sqrt(num1 * num2);

        System.out.printf("A média geométrica é: %.2f\n" , media);

        scanner.close();
    }
    
}
