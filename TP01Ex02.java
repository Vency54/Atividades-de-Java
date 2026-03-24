
import java.util.Scanner;

public class TP01Ex02 {

    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
        digitado.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         double aresta;
         double area;
         
         while (true) {
            System.out.println("Digite o valor da aresta:");

            if (scanner.hasNextDouble()) {
                aresta = scanner.nextDouble();
                System.out.println();
                if (aresta > 0) {
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


        area = aresta * aresta;

        System.out.printf("A área do quadrado é: %.2f\n" , area);

        scanner.close();   
    }
    
}
