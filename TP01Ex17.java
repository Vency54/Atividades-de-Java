
import java.util.*;

public class TP01Ex17 {

     /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira
    
      17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double resultado;
        
     
        while(true){
        
               while (true) {
         System.out.println("Digite o valor de x: ");

        if (scanner.hasNextDouble()) {
        x = scanner.nextDouble();
                System.out.println();
                    break;
        
            } else {
                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
       
               
               while (true) {
           System.out.println("Digite o valor de y: ");

        if (scanner.hasNextDouble()) {
        y = scanner.nextDouble();
                System.out.println();
                    break;
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }   
        
        
        if (x < 0 && y % 1 != 0) {
    System.out.println("Erro! X não pode ser negativo, se Y não é inteiro");
    continue;
}
        if (x == 0 && y < 0) {
    System.out.println("Erro! 0 não pode ser elevado a expoente negativo.");
    continue;
}
        break;
        }
        
        
        resultado = Math.pow(x, y);
        
        System.out.printf("O resultado é: %.2f%n" , resultado);

        
        
    
}
}
