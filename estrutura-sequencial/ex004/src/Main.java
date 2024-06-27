import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite o valor de: ");
        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        System.out.print("C: ");
        c = sc.nextInt();
        System.out.print("D: ");
        d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("Diferença: " + diferenca);

    }
}