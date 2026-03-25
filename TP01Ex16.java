
import java.util.*;

public class TP01Ex16 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
      16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
          seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
          Lembre-se que uma função trigonométrica trabalha em radianos. */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double angulo;
        double radianos;
        double seno;
        double cosseno;
        double tangente;
        double secante;
        
       while (true) {
        System.out.println("Digite o valor do ângulo: ");

        if (scanner.hasNextDouble()) {
        angulo = scanner.nextDouble();
                System.out.println();
                    break;
        
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
       
        
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
