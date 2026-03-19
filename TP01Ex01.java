/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex01;
import java.util.Scanner;

public class TP01Ex01 {

/* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.*/
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double base;
         double altura;
         double area;
         
        System.out.println("Digite a base do retngulo:");
        base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
    
