/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex14;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex14 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
          digitados. */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
          double volumeEsfera;
          double volumeLivre;
          double volumeCubo;  
          
        System.out.println("Digite o valor do raio da esfera (r): ");
        double r = scanner.nextDouble();

        System.out.println("Digite o valor da aresta do cubo (a): ");
        double a = scanner.nextDouble();

         volumeCubo = Math.pow(a, 3);
         volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

         volumeLivre = volumeCubo - volumeEsfera;

        
        System.out.printf("Volume do cubo: %.2f%n", volumeCubo);
        System.out.printf("Volume da esfera: %.2f%n", volumeEsfera);
        
        if(volumeLivre >= 0)
        {
        System.out.printf("Volume livre no ambiente: %.2f%n", volumeLivre);
        }else
        {
            System.out.println("A Esfera não cabe no cubo");
        }

    }
    
}
