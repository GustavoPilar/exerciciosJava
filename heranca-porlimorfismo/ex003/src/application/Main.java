package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			sc.nextLine();
			System.out.println("\n-- Shape #" + (i+1) + " data --");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			while (shape != 'r' && shape != 'c') {
				System.out.print("Invalid shape. Come again: ");
				shape = sc.next().charAt(0);
				sc.nextLine();
			}
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine().toUpperCase());
			switch(shape) {
				case 'r':
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.print("Height: ");
					double height = sc.nextDouble();
					shapes.add(new Rectangle(width, height, color));
					break;
				case 'c':
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					shapes.add(new Circle(radius, color));
					break;
			}
		}
		
		System.out.println("Shape areas: ");
		for(Shape s : shapes) {
			System.out.printf("%.2f%n", s.area());
		}
		
		sc.close();
	}

}
