package application;

import entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<User> set = new HashSet<>();
        System.out.print("Enter file full path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                set.add(new User(fields[0], Instant.parse(fields[1])));
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
