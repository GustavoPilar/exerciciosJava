package entities;

public class Worker {

	public String name;
	public double grossSalary;
	public double tax;
	
	public Worker(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossDouble() {
		return grossSalary;
	}

	public void setGrossDouble(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(float percentage) {
		grossSalary += (grossSalary / 10) * 1.0; 
	}

	@Override
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", netSalary());
	}

	
	
}
