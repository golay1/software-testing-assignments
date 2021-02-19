package Homework4;

public class Problem3Class {

	private boolean greenLight,yellowLight,redLight,buzzer,brakes;
	private int count;
	
	public void setWarnings (double distance) {
		redLight=yellowLight=greenLight=buzzer=brakes=false;
		if (distance >= 400.0)
			greenLight=true;
		else
			if (distance > 95.0)
				yellowLight=true;
			else
				if (distance >= 50.0) {
					buzzer=true;
					yellowLight=true;}
				else 
					if (distance > 25.0){
						redLight=true;
						buzzer=true; }
					else {
						brakes=true;
						redLight=true;
						buzzer=true;
						count++;}
		
		if (count == 2) {
			brakes = false;
			count=0; }
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isBrakes() {
		return brakes;
	}

	public void setBrakes(boolean brakes) {
		this.brakes = brakes;
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}

	public boolean isBuzzer() {
		return buzzer;
	}

	public void setBuzzer(boolean buzzer) {
		this.buzzer = buzzer;
	}
}