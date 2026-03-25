
import java.util.*;

public class TP01Ex18 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
      18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
           valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
            que deverá ser devolvido. */
    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] produtos = new double[5];
            double soma = 0;
            double pagamento;
            double troco;
           

            for (int i = 0; i < 5; i++) {
            while(true){
            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            
            if(!scanner.hasNextDouble()){
            System.out.println(" ");
            System.out.println("Erro! Apenas números");
            System.out.println(" ");
            scanner.next();
            continue;
            }
            
            produtos[i] = scanner.nextDouble();
            System.out.println(" ");

           if(produtos[i] < 0){
            System.out.println("Erro! Apenas números positivos");
            System.out.println(" ");
            continue;
            }
            
            soma += produtos[i];
            break;
        }       
    }
            
            System.out.printf("Total da Compra: R$%.2f%n", soma);
            System.out.println("================================");
            System.out.print("Insira o valor para pagamento: ");
            pagamento = scanner.nextDouble();
            
            if(pagamento < soma){
            System.out.println(" ");
            System.out.println("Valor insuficiente");
            return;
            }
            
            troco = pagamento - soma;
            
            System.out.println(" ");
            System.out.printf("Valor do troco: R$%.2f%n\"",  troco);
            
    }
    
}
