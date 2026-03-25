
import java.util.*;

public class TP01Ex14 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
          digitados. */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
          double volumeEsfera;
          double volumeLivre;
          double volumeCubo;  
          double r;
          double a;
          
          while (true) {
        System.out.println("Digite o valor do raio da esfera (r): ");

            if (scanner.hasNextDouble()) {
         r = scanner.nextDouble();
                System.out.println();
                         if (r > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Apenas números maiores que zero");
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
        System.out.println("Digite o valor da aresta do cubo (a): ");

            if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
                System.out.println();
                         if (a > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Apenas números maiores que zero");
                    System.out.println();
                }
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
         
         if (2 * r > a){
         System.out.println("A Esfera não cabe no cubo");
         }
         else{
         
         volumeCubo = Math.pow(a, 3);
         volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

         volumeLivre = volumeCubo - volumeEsfera;

        
        System.out.printf("Volume do cubo: %.2f%n", volumeCubo);
        System.out.printf("Volume da esfera: %.2f%n", volumeEsfera);
        System.out.printf("Volume livre no ambiente: %.2f%n", volumeLivre);
        
         }
         

    }
    
}
