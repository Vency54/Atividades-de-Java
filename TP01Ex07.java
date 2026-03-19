/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex07;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex07 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: JoÃ£o Victor Lima Venceslau e Rayssa Silva de Oliveira 
     7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
      digitados.*/
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double media;
        
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
         num2 = scanner.nextDouble();

         media = Math.sqrt(num1 * num2);

        System.out.println("A média geométrica é: " + media);

        scanner.close();
    }
    
}
