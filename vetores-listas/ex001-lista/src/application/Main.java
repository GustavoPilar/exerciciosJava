package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many emplooyes will be resgistered: ");
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Code: ");
			Integer code = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(code, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getCode() == id).findFirst().orElse(null);
		
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		} else {
			System.out.println("There's not exist.");
		}
		
		System.out.println("\nList of employees: ");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();

	}
}
