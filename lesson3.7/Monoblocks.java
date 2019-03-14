
public class Monoblocks extends Computers{

	public Monoblocks(String nameMB, double countMB, double quantityMB, double storage, double hdd, double coreCPU) {
		name = nameMB;
	    count = countMB;
	    quantity = quantityMB;
	    storage = storage;
	    hdd = hdd;
	    coreCPU = coreCPU;
	}

	@Override
	public String toString() {
		return "Laptop " + " " + name + " " + count + "rub  " + quantity + " pieces " + storage + " Gb " + "HDD " + hdd + coreCPU + " core" ;
	}

	@Override
	protected int getDaysForReturn() {
		return 0;
	}
	
	
}
