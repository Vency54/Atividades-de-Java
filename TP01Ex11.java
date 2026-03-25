
import java.util.*;

public class TP01Ex11 {

    /*Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
     11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         double diametro;
         double area;
         
         while (true) {
         System.out.println("Digite o valor do diâmetro: ");

            if (scanner.hasNextDouble()) {
         diametro = scanner.nextDouble();
                System.out.println();
            if (diametro > 0) {
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
         
         
         area = Math.PI*(Math.pow((diametro/2),2));
         
         System.out.printf("Valor da área do círculo: %.2f\n" , area);
         scanner.close();
    }
    
}
