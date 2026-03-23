/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex06;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex06 {

    /**
     * @param args the command line arguments
     */
    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
      digitados.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[4];
        double soma = 0;
        double media;
        
for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }
        
        media = soma/4;
        
        System.out.println("Média aritmética: "+media);
        
        
    }
    
}
