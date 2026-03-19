/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex04;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP01Ex04 {

    /**
     * @param args the command line arguments
     */
    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Digite o valor da base:");
        base = scanner.nextDouble();
        
        System.out.println("Digite o valor da altura:");
        altura = scanner.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.println("A área do triângulo é: "+area);
        
        
        scanner.close();
    }
    
    
}
