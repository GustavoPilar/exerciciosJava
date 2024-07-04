package entities;

public final class Company extends TaxPayer {
	
	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public final Double tax() {
		if(numberOfEmployees < 10) {
			return (super.getAnualIncome() / 10) * 1.6;
		} else {
			return (super.getAnualIncome() / 10) * 1.4;
		}
	}

}
