/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex11;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP01Ex11 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
     11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         double diametro;
         double area;
         
         System.out.println("Digite o valor do diâmetro: ");
         diametro = scanner.nextDouble();
         
         area = Math.PI*(Math.pow((diametro/2),2));
         
         System.out.println("Valor da área do círculo: "+area);
         scanner.close();
    }
    
}
