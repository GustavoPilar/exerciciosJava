package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();

        System.out.print("How many student for course A: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int id = sc.nextInt();
            cursoA.add(id);
        }

        System.out.print("How many student for course B: ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int id = sc.nextInt();
            cursoB.add(id);
        }

        System.out.print("How many student for course C: ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int id = sc.nextInt();
            cursoC.add(id);
        }

        Set<Integer> alunos = new HashSet<>(cursoA);
        alunos.addAll(cursoB);
        alunos.addAll(cursoC);

        System.out.println("Total studenst: " + alunos.size());
        sc.close();
    }
}
