package entities;

public class Employee {
	private Integer code;
	private String nome;
	private Double salary;
	
	public Employee(Integer code, String nome, Double salary) {
		this.code = code;
		this.nome = nome;
		this.salary = salary;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double increaseSalary(double percentage) {
		return salary += (salary / 10) * (percentage / 10);
	}
	
	@Override
	public String toString() {
		return code + ", " + nome + ", " + salary;
	}
	
	
	
}
