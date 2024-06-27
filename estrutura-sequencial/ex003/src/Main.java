import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;

        System.out.print("Escreva o valor do raio: ");
        double raio = sc.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("Área: %.4f%n", area);

    }
}