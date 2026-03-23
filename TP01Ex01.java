/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class TP01Ex01 {

/* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;
        double area;

            while (true) {
            System.out.println("Digite a base do retângulo:");

            if (scanner.hasNextDouble()) {
                base = scanner.nextDouble();
               System.out.println();
                if (base > 0) {
                    break;
                } else {
                    System.out.println("Erro! Apenas valores maiores que 0.");
                    System.out.println();
                }

            } else {
                System.out.println();
                System.out.println("Erro! Apenas números");
                System.out.println();
                scanner.next(); 
            }
        }

        while (true) {
            System.out.println("Digite a altura do retângulo:");

            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                System.out.println();
                if (altura > 0) {
                    break;
                } else {
                System.out.println("Erro! Apenas valores maiores que 0.");
                    System.out.println();
                }

            } else {
                 System.out.println();
                System.out.println("Erro! Apenas números");
                System.out.println();
                scanner.next(); 
            }
        }

        area = base * altura;

        System.out.printf("A área do retângulo é: %.2f\n", area);

        scanner.close();
    }
}
    
