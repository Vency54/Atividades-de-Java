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
            double produto1;
            double produto2;
            double produto3;
            double produto4;
            double produto5;
            double soma;
            double pagamento;
            double troco;
            
            System.out.println("Digite o valor do produto 1: ");
            produto1 = sc.nextDouble();
            System.out.println("Digite o valor do produto 2: ");
            produto2 = sc.nextDouble();
            System.out.println("Digite o valor do produto 3: ");
            produto3 = sc.nextDouble();
            System.out.println("Digite o valor do produto 4: ");
            produto4 = sc.nextDouble();
            System.out.println("Digite o valor do produto 5: ");
            produto5 = sc.nextDouble();
            
            soma = produto1 + produto2 + produto3 + produto4 + produto5;
            System.out.printf("Total da Compra: R$%.2f%n\"", soma);
            System.out.println("================================");
            System.out.println("Insira o valor para pagamento: ");
            pagamento = sc.nextDouble();
            
            troco = pagamento - soma;
            
            System.out.printf("Valor do troco: R$%.2f%n\"",  troco);
            
    }
    
}
