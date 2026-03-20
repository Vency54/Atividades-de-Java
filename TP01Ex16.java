/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex16;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex16 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
      16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
          seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
          Lembre-se que uma função trigonométrica trabalha em radianos. */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double angulo;
        double radianos;
        double seno;
        double cosseno;
        double tangente;
        double secante;
        
        System.out.println("Digite o valor de um ângulo: ");
        angulo = sc.nextDouble();
        
        radianos = Math.toRadians(angulo);
        
        seno = Math.sin(radianos);
        
        cosseno = Math.cos(radianos);
        
        tangente = Math.tan(radianos);
        
        secante = 1/cosseno;
        
        System.out.printf("Valor do seno: %.2f%n" , seno);
        System.out.printf("Valor do cosseno: %.2f%n" , cosseno);
        System.out.printf("Valor da tangente: %.2f%n" , tangente);
        System.out.printf("Valor da secante: %.2f%n" , secante);

    }
    
}
