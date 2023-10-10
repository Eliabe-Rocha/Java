import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        
        System.out.println("Digite o combústivel a ser recarregado: ");
        System.out.println("1 - Alcool;\n2 - Gasolina;\n3 - Diesel;\n4 - Sair.\n");
        int fuel;
        
        do {
            fuel = sc.nextInt();
            if (fuel < 1 && fuel > 4) {
                System.out.println("Digite o combústivel a ser recarregado: ");
                System.out.println("Por gentileza, digite um valor válido!!!");
            } else if (fuel == 1) {
                System.out.println("Digite o combústivel a ser recarregado: ");
                alcool += 1;
            } else if (fuel == 2){
                System.out.println("Digite o combústivel a ser recarregado: ");
                gasolina += 1;
            } else if (fuel == 3) {
                System.out.println("Digite o combústivel a ser recarregado: ");
                diesel += 1;
            } else {
                System.out.println("MUITO OBRIGADO!");
                System.out.printf("Alcool: %d \nGasolina: %d \nDiesel: %d", alcool, gasolina, diesel);
            }
        }
        while (fuel != 4);
    }
}