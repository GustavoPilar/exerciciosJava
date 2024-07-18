package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File path = new File(System.getProperty("user.dir") + "\\in.txt");

        try (Scanner sc = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<Employee> employeeList = new TreeSet<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.valueOf(fields[2])));

                line = br.readLine();
            }
            System.out.print("Enter the salary: U$");
            double min = sc.nextDouble();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", min));
            Stream<String> emails = employeeList.stream().filter(x -> x.getSalary() >= min).map(Employee::getEmail);
            emails.forEach(System.out::println);
            double sum = employeeList.stream().filter(x -> x.getName().charAt(0) == 'M').map(Employee::getSalary).reduce((double) 0, Double::sum);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
