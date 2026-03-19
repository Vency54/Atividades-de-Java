/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex05;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex05 {

    /**
     * @param args the command line arguments
     */
      /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        será digitado.*/
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
          double diametro;
          double raio;
          double volume;
          
          
          System.out.println("Digite o diâmetro da esfera: ");
          diametro = scanner.nextDouble();
          
          raio = diametro/2;
          
          volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
          
          System.out.println("Volume da esfera: "+volume);
          scanner.close();
    }
    
}
