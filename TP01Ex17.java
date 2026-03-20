/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex17;
import java.util.*;

/**
 *
 * @author aluno
 */
public class TP01Ex17 {

     /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
      17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double resultado;
        
         System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();
        
           System.out.println("Digite o valor de y: ");
        y = sc.nextDouble();
        
        resultado = Math.pow(x, y);
        
        System.out.printf("O resultado é: %.2f%n" , resultado);

        
        
        
    }
    
}
