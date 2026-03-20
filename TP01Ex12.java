/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex12;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex12 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
          base que serão digitados. */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double altura;
        double raio;
        double volume; 
        
         System.out.println("Digite o valor da altura: ");
         altura = scanner.nextDouble();
         
         System.out.println("Digite o valor do raio da base: ");
         raio = scanner.nextDouble();
        
        volume = (Math.PI*(Math.pow(raio,2)*altura))/3;
        
        
        System.out.printf("Volume do cone: %.2f%n" , volume);
        
        
    }
    
}
