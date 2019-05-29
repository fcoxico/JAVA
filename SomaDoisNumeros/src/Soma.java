import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int soma;


        System.out.print("Enter first integer: ");
        num1 = entrada.nextInt();

        System.out.print("Enter second integer: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;

        System.out.printf("Soma é %d%n", soma);

    }
}