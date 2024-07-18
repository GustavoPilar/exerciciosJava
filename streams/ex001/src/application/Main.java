package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        File path = new File(System.getProperty("user.dir") + "\\in.txt");
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0],Double.valueOf(fields[1])));

                line = br.readLine();
            }
            double avarage = products.stream().map(Product::getPrice).reduce((double) 0, (x, y) -> x + y) / products.size();
            System.out.println("Full file path: " + path.getAbsolutePath());
            System.out.printf("Avarage price: %.2f%n", avarage);
            Stream<String> names = products.stream().filter(x -> x.getPrice() < avarage).map(x -> x.getName());
            names.forEach(System.out::println);

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
