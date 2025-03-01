package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle rec = new Rectangle(width, height);
		
		System.out.println(rec);
		
		sc.close();

	}

}
