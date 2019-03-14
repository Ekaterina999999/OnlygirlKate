
public class Laptops extends Computers implements Returnable {

	private double diagonal;
    private double batteryLife;
    
   
	public Laptops(String nameLP, double countLP, double quantityLP, double storageLP, double hddLP, double coreCPULP, double diagonalLP, double batteryLifeLP) {
        name = nameLP;
        count = countLP;
        quantity = quantityLP;
        storage = storageLP;
        hdd = hddLP;
        coreCPU = coreCPULP;
        diagonal = diagonalLP;
        batteryLife = batteryLifeLP;
    }
    
    
	@Override
	public String toString() {
		return "Laptop " + " " + name + " " + count + "rub  " + quantity + " pieces " + storage + " Gb " + "HDD " + hdd + coreCPU + " core" + diagonal + " cm" + batteryLife + " hour";
	}


	public double getDiagonal() {
		return diagonal;
	}


	public double getBatteryLife() {
		return batteryLife;
	}


	@Override
	public void getRequiredDocuments() {
		System.out.println("You need passport and check");
		
	}

	@Override
	public int getDaysForReturn() {
		return 14 ;
		
	}
	 
}
