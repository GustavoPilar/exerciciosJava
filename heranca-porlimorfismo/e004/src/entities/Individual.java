package entities;

public final class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;	
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final Double tax() {
		if(super.getAnualIncome() < 20000.0) {
			if(healthExpenditures != 0.0) {
				return ((super.getAnualIncome() / 10) * 1.5) - ((healthExpenditures / 10) * 5);
			} else {
				return (super.getAnualIncome() / 10) * 1.5;
			}
		} else {
			if(healthExpenditures != 0.0) {
				return ((super.getAnualIncome() / 10) * 2.5) - ((healthExpenditures / 10) * 5);
			} else {
				return (super.getAnualIncome() / 10) * 2.5;
			}
		}
	}

}
