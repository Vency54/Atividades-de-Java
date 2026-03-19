/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex10;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex10 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
         exibir sua temperatura equivalente em Fahrenheit */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        
        System.out.println("Digite a temperatura em celsius: ");
        celsius = scanner.nextDouble();
        
        fahrenheit = celsius * 1.8 + 30;
        
        System.out.println("Conversão para fahrenheit: "+fahrenheit);
        
        scanner.close();
        
    }
    
}
