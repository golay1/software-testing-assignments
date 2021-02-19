package Homework5;

public class Problem1Class {
	
	private double total;
	private boolean specialOrderStatus;

	public void specialOrder (boolean deepDish, double ordAmount, int numPizzas) {

		double discount;
		if (ordAmount <= 50.00)
			discount = 0.00;
		else
			if (ordAmount <= 100.00)
				discount = 0.05;
			else
				if (ordAmount <= 250.00)
					discount = 0.10;
				else
					if (ordAmount <= 500.0)
						discount = 0.15;
					else
						discount = 0.20;
		total = ordAmount*(1-discount)*1.0825;
				
		specialOrderStatus = (!deepDish) || (ordAmount > 50.0) || (numPizzas > 4);
		}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isSpecialOrderStatus() {
		return specialOrderStatus;
	}

	public void setSpecialOrderStatus(boolean specialOrderStatus) {
		this.specialOrderStatus = specialOrderStatus;
	}
}