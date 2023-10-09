import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        
        Scanner number = new Scanner(System.in);
        String dia; 
        
        System.out.println("Digite o dia da semana:");
        int x = number.nextInt();
        
        switch (x) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Valor inválido!!!\nDigite um número de um 1 a 7!";
            break;
        }
        
        System.out.println("O dia da semana é " + dia);
        
        number.close();
    }
}