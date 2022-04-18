package entities;

public class Person extends TaxPayment {

	private Double health;
	
	public Person() {
		super();
	}

	public Person(String name, Double anualIncome, Double health) {
		super(name, anualIncome);
		this.health = health;
	}
	
	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public double tax() {
		double result = 0;
		if (super.getAnualIncome() < 20000) {
			result += super.getAnualIncome() * 0.15;
		} else {
			result += super.getAnualIncome() * 0.25;
		}
		if (health > 0) {
			result -= health/2;
		}
		return result;
	}

}
