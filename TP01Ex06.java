/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex06;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex06 {

    /**
     * @param args the command line arguments
     */
    /* Nomes: JoÃ£o Victor Lima Venceslau e Rayssa Silva de Oliveira 
    6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
      digitados.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        
        System.out.println("Digite o primeiro número: ");
        n1= scanner.nextDouble(); 
        
        System.out.println("Digite o segundo número: ");
        n2= scanner.nextDouble(); 
        
        System.out.println("Digite o terceiro número: ");
        n3= scanner.nextDouble(); 
        
        System.out.println("Digite o quarto número: ");
        n4= scanner.nextDouble(); 
        
        media = (n1 + n2 + n3+ n4)/4;
        
        System.out.println("Média aritmética: "+media);
        
        scanner.close();
        
        
    }
    
}
