/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex08;

import java.util.*;

/**
 *
 * @author aluno
 */
public class TP01Ex08 {

    /**
     * @param args the command line arguments
     */
     /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
        dois metros e que um quilômetro possui mil metros, fazer um programa para
        converter milhas marítimas em quilômetros.*/
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       double milhas;
       double quilometros;
       
        System.out.print("Digite a quantidade de milhas marítimas: ");
        milhas = scanner.nextDouble();

        quilometros = milhas * 1.852;

        System.out.println("Equivalente em quilômetros: " + quilometros + " km");

    }
    
}
