package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> candidates = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try (sc; BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                if (candidates.containsKey(fields[0])) {
                    Integer sum = Integer.parseInt(fields[1]) + candidates.get(fields[0]);
                    candidates.put(fields[0], sum);
                } else {
                    candidates.put(fields[0], Integer.valueOf(fields[1]));
                }

                line = br.readLine();
            }

            for(String key : candidates.keySet()) {
                System.out.println(key + ": " + candidates.get(key)) ;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Ending program...");
        }

    }
}
