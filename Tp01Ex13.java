/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01Ex13;
import java.util.*;
/**
 *
 * @author aluno
 */
public class Tp01Ex13 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
         valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
         (em s) que serão digitados. */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double VelocidadeInicial;
        double Aceleracao;
        double TempodePercurso;
        double VelocidadeFinal;
        
        System.out.println("Digite o valor da velocidade inicial: ");
        VelocidadeInicial = scanner.nextDouble();
        
        System.out.println("Digite o valor da aceleração: ");
        Aceleracao = scanner.nextDouble();
        
          System.out.println("Digite o valor do tempo de percurso: ");
        TempodePercurso = scanner.nextDouble();
        

        VelocidadeFinal = (VelocidadeInicial + Aceleracao * TempodePercurso)*3.6;
        
        System.out.printf("Velocidade final é : %.2f km/h%n", VelocidadeFinal);

        
    }
    
}
