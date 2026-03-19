/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex02;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex02 {

    /**
     * @param args the command line arguments
     */
    /* Nomes: Joãoo Victor Lima Venceslau e Rayssa Silva de Oliveira 
    2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será¡
        digitado.*/
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         double aresta;
         double area;
         
        System.out.println("Digite o valor da aresta:");
        aresta = scanner.nextDouble();

        area = aresta * aresta;

        System.out.println("A área do quadradoo é: " + area);

        scanner.close();   
    }
    
}
