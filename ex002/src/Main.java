import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}