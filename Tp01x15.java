/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01x15;
import java.util.*;

/**
 *
 * @author aluno
 */
public class Tp01x15 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
   15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
        double CotacaoDolar;
        double Dolares;
        double Reais;
        
        System.out.println("Digite o valor da Cotação do dólar: ");
        CotacaoDolar = sc.nextDouble();
        
           System.out.println("Digite uma quantia em dólares: ");
        Dolares = sc.nextDouble();
        
        Reais = CotacaoDolar * Dolares;
        
        System.out.printf("Quantia em Reais : R$%.2f%n\"", Reais);

                
    }
    
}
