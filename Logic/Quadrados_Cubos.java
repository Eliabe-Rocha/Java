import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor:");
        double linha = sc.nextDouble();
        
        System.out.println("\n\nA Tabela de quadrdados e cubos é:");
        for (double i = 1; i <= linha; i++) {
            double quad = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);

            System.out.printf("%.0f     %.0f      %.0f\n", i, quad, cubo);
        }
        
        sc.close();
    }
}