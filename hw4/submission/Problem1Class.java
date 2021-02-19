package Homework4;

public class Problem1Class {

	public double calcRate (boolean member, boolean primeStatus, double cart) {
		double rate;
		if (member)
			if (primeStatus)
				if (cart >= 5_000.00)
					rate=0.95;
				else
					rate=0.9;
			else
				if (cart >= 5_000.00)
					rate=0.925;
				else
					rate=0.95;
		else
			if (primeStatus)
				if (cart >= 5_000.00)
					rate=0.975;
				else
					rate=0.955;
			else
				if (cart >= 5_000.00)
					rate=0.965;
				else
					rate=0.985;
		return rate;
	}
}