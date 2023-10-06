import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner number = new Scanner(System.in);

            int a;
            int b;
            int c;
            int d;
            int diference = 0;

            a = number.nextInt();
            b = number.nextInt();
            c = number.nextInt();
            d = number.nextInt();

            diference = ((a * b) - (c * d));

            System.out.println("Diferença = " + diference);

        number.close();

    }
}