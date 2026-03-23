/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex18;
import java.util.*;
/**
 *
 * @author aluno
 */
public class TP01Ex18 {

    /**
     * @param args the command line arguments
     */
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
      18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
           valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
            que deverá ser devolvido. */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            double produtos = new double[5];
            double soma = 0;
            double pagamento;
            double troco;
            
             for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextDouble();
            soma += produtos[i];
        }            
            System.out.printf("Total da Compra: R$%.2f%n\"", soma);
            System.out.println("================================");
            System.out.println("Insira o valor para pagamento: ");
            pagamento = sc.nextDouble();
            
            troco = pagamento - soma;
            
            System.out.printf("Valor do troco: R$%.2f%n\"",  troco);
            
    }
    
}
