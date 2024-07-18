package entities;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String email;
    private Double salary;

    public Employee() {}

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + String.format("%.2f", getSalary()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }


    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
