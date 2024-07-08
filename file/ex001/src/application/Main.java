package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String strPath = "Documentos\\java\\exerciciosJava\\file\\products.txt";
		File path = new File(strPath);
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			List<Product> products = new ArrayList<>();
			System.out.println("PRODUCTS:");
			while(line != null) {
				System.out.println(line);
				String[] strProducts = line.split(",");
				Product product = new Product(strProducts[0], Double.valueOf(strProducts[1]), Integer.valueOf(strProducts[2]));
				products.add(product);
				line = br.readLine();
			}
			
			boolean success = new File(path.getParent() + "\\out").mkdir();
			System.out.println("\nCREATING A NEW FOLDER: " + success);
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out\\totalValues.txt"))) {
				System.out.println("\nNEW FILE:");
				for(Product p : products) {
					System.out.println(p);
					bw.write(p.toString());
					bw.newLine();
				}
			}
			catch (IOException e) {
				e.getStackTrace();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
