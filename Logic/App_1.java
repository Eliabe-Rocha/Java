import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner valor = new Scanner(System.in);
        
        int x;
        int y;
        int soma;

        System.out.println("Digite o 1º valor: ");
        x = valor.nextInt();
        
        System.out.println("Digite o 2º valor: ");        
        y = valor.nextInt();

        soma = x + y;
        System.out.println("A soma entre " + x + " e " + y + " é " + soma);

        valor.close();
    }
}