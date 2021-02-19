package Homework4;

public class Problem4Class {
	
	private boolean memberBonus;
	private double total;

	public void determineMemberBonus (double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, double taxRate) {
		double discount;memberBonus=false;
		if (cart >= 2_500.00)
			discount = 0.2;
		else
			if (cart > 1_500.00)
				discount = 0.15;
			else
				if (cart > 750.0)
					discount = 0.125;
				else
					if (cart >= 500.00)
						discount = 0.10;
					else
						discount = 0.0;
		
		total = (1+taxRate)*cart*(1.0-discount);
		
		if (firstTimeBuyer)
			memberBonus = true;
		else
			if (goldStatus)
				memberBonus = true;
			else 
				if (cart > 1_000.00)
					if (bonusPoints > 750)
						memberBonus = true;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isMemberBonus() {
		return memberBonus;
	}
	public void setMemberBonus(boolean memberBonus) {
		this.memberBonus = memberBonus;
	}
}