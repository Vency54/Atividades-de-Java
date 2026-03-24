
import java.util.*;


public class TP01Ex04 {

    /* Nomes: João Victor Lima Venceslau e Rayssa Silva de Oliveira 
    
    4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.*/
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        while (true) {
            System.out.println("Digite o valor da base:");

            if (scanner.hasNextDouble()) {
                base = scanner.nextDouble();
                System.out.println();
                if (base > 0) {
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
        System.out.println("Digite o valor da altura:");

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

        area = (base * altura)/2;
        
        System.out.printf("A área do triângulo é:%.2f\n", area);
        
        
        scanner.close();
    }
    
    
}
