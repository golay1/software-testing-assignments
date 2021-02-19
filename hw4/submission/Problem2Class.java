package Homework4;

public class Problem2Class {

	public boolean highPressCell (Problem2ClassStatus status, double temp, double pressure) {
		   boolean HPCell=false;

		   if (status==Problem2ClassStatus.NorthernHemisphere) {
			   if (temp > 120.0)
				   HPCell = true;
			   else
				   if (pressure <= 39.0)
					   if (pressure > 30.5)
						   HPCell = true; }
		   else
			   if (temp >= 80.0)
				   if (pressure <= 39.5)
					   if (pressure > 31.0)
						   HPCell = true; 
		   return HPCell;
		}
}