
import java.util.*;

public class TP01Ex13 {
    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
         valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
         (em s) que serão digitados. */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double VelocidadeInicial;
        double Aceleracao;
        double TempodePercurso;
        double VelocidadeFinal;
        
                   while (true) {
        System.out.println("Digite o valor da velocidade inicial (em m/s): ");

            if (scanner.hasNextDouble()) {
        VelocidadeInicial = scanner.nextDouble();
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
        System.out.println("Digite o valor da aceleração (m/s2): ");

            if (scanner.hasNextDouble()) {
        Aceleracao = scanner.nextDouble();
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
          System.out.println("Digite o valor do tempo de percurso (em s): ");

            if (scanner.hasNextDouble()) {
        TempodePercurso = scanner.nextDouble();
                System.out.println();
             if (TempodePercurso >= 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Não existe tempo negativo");
                    System.out.println();
                }
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
        

        VelocidadeFinal = (VelocidadeInicial + Aceleracao * TempodePercurso)*3.6;
        
        System.out.printf("Velocidade final é : %.2f km/h%n", VelocidadeFinal);

        
    }
    
}
