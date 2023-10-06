import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        
        Scanner values = new Scanner(System.in);

        double a;
        double b;
        double c;
        double areaTri;
        double areacirc;
        double areatrap;
        double areaquad;
        double arearet;

        System.out.println("Digite o vlaor de A:");
        a = values.nextDouble();
        
        System.out.println("Digite o vlaor de A:");        
        b = values.nextDouble();

        System.out.println("Digite o vlaor de A:");        
        c = values.nextDouble();
        
        areaTri = (a * c)/2;
        areacirc = Math.PI * (Math.pow(c, 2));
        areatrap = ((a + b) * c)/2;
        areaquad = Math.pow(b, 2);
        arearet = (a * b);

        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areacirc);
        System.out.printf("TRAPEZIO: %.3f\n", areatrap);
        System.out.printf("QUADRADO: %.3f\n", areaquad);
        System.out.printf("RETANGULO: %.3f\n", arearet);

        values.close();
    }

}