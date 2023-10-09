import java.util.Scanner;


public class Main {
    public static void main (String[] args) {

        double salario;
        double resultado = 0;
        
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Cálculo do Imposto de Renda: ");
        System.out.println("Digite o salário: ");
        
        salario = valor.nextDouble();
        
        
        if (salario <= 2000) {
            
            System.out.println("Você está isento do IR!");
            
        } else if (salario > 2000 && salario <= 3000) {
            
            resultado = (salario - 2000) * 0.08;
            
        } else if (salario > 3000 && salario <= 4500) {
            
            resultado = (salario - 3000) * 0.18 + (1000 * 0.08);
            
        } else {
            resultado = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
            
        }
        
        System.out.printf("O valor a ser pago de IR é R$ %.2f!", resultado);
        
        valor.close();
    }
}