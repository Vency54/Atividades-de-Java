
import java.util.*;

public class TP01Ex12 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
          base que serão digitados. */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double altura;
        double raio;
        double volume; 
        
        while (true) {
         System.out.println("Digite o valor da altura: ");

            if (scanner.hasNextDouble()) {
         altura = scanner.nextDouble();
                System.out.println();
            if (altura > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Apenas valores maiores que 0.");
                    System.out.println();
                }
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
         
                 
                                                   while (true) {
         System.out.println("Digite o valor do raio da base: ");

            if (scanner.hasNextDouble()) {
         raio = scanner.nextDouble();
                System.out.println();
            if (raio > 0) {
                    break;
                } else {
                
                    System.out.println("Erro! Apenas valores maiores que 0.");
                    System.out.println();
                }
            } else {
                                System.out.println();   
                System.out.println("Erro! Apenas números");
                                System.out.println();
                scanner.next(); 
            }
        }
                                                   
        
         
        
        volume = (Math.PI*(Math.pow(raio,2)*altura))/3;
        
        
        System.out.printf("Volume do cone: %.2f%n" , volume);
        
        
    }
    
}
