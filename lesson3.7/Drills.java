
public class Drills extends Elinstrument implements Returnable{
	  
	
	public double diameter;

	public Drills(String nameD, double countD, int quantityD, double powerConsumD, double diameterD) {
	        name = nameD;
	        count = countD;
	        quantity = quantityD;
	        powerConsum = powerConsumD;
	        diameter = diameterD;
	    }

	

	@Override
	public String toString() {
		return "Drill " + " " + name + " " + count + "rub  " + quantity + " pieces " + diameter + " cm ";
	}



	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public void getRequiredDocuments() {
		System.out.println("You need check");
	}

	@Override
	public int getDaysForReturn() {
		return 14;
		
	}
	
	
}
