package entities;

public class Company extends TaxPayment {

	private Integer quantEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer quantEmployee) {
		super(name, anualIncome);
		this.quantEmployee = quantEmployee;
	}

	public Integer getQuantEmployee() {
		return quantEmployee;
	}

	public void setQuantEmployee(Integer quantEmployee) {
		this.quantEmployee = quantEmployee;
	}

	@Override
	public double tax() {
		double result = 0;
		if (quantEmployee > 10) {
			result += super.getAnualIncome() * 0.14;
		} else {
			result += super.getAnualIncome() * 0.16;
		}
		return result;
	}

}
