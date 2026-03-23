/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex09;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex09 {

    /**
     * @param args the command line arguments
     */
     /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
       valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double tensao;
        double resistencia;
        double corrente;
        
        System.out.println("Digite o valor da resistência: ");
        resistencia = scanner.nextDouble();
        
        System.out.println("Digite o valor da corrente: ");
        corrente = scanner.nextDouble();
        
        tensao = resistencia * corrente;
        
        System.out.println("Valor da tensão do circuito: "+tensao);
        
    }
    
}
