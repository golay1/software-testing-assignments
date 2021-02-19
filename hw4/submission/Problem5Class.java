package Homework4;

public class Problem5Class {
	private double y;
	
	public double calcY (double x) {
		if (x<-4.0)
			y=0.0;
		else
			if (x<-3.0)
				y=x+4.0;
			else
				if (x<=-2.0)
					y=-x-2.0;
				else
					if (x<0.0)
						y=4*x+8.0;
					else
						if (x<4.0)
							y=-x*x+2*x+8.0;
						else
							if (x<=5.0)
								y=-x+4.0;
							else
								if (x<6.0)
									y=x-6.0;
								else
									y=0.0;
		return y;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}