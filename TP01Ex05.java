
import java.util.Scanner;

public class TP01Ex05 {

      /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        será digitado.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
          double diametro;
          double raio;
          double volume;
          
          
                 while (true) {
          System.out.println("Digite o diâmetro da esfera: ");

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
        
          
          raio = diametro/2;
          
          volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
          
          System.out.printf("Volume da esfera: %.2f\n", volume);
          scanner.close();
    }
    
}
