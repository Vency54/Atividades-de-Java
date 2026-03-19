/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex03;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex03 {

    /**
     * @param args the command line arguments
     */
    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
        digitado.*/
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         double diagonal;
         double area;
         
         System.out.println("Digite o valor da diagonal: ");
         diagonal = scanner.nextDouble();
         
         area = (diagonal*diagonal)/2;
         
         System.out.println("A área do quadrado é: "+area);
         scanner.close();
         
    }
    
}
