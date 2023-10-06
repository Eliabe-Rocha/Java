import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        double raio;
        double pi = Math.PI;
        double area;
        
        raio = entrada.nextDouble();

        area = pi * Math.pow(raio,2);

        
        System.out.println("Area do cídulo é " + area);


        entrada.close();
    }
}
