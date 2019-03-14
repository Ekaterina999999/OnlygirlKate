
public class Jigsaws extends Elinstrument {
	public double notch;

    public Jigsaws(String nameJ, double countJ, double quantityJ, double powerConsumJ, double notchJ) {
        name = nameJ;
        count = countJ;
        quantity = quantityJ;
        powerConsum = powerConsumJ;
        notch = notchJ;
    }

	@Override
	public String toString() {
		return "Jig saw " + " " + name + " " + count + "rub  " + quantity + " pieces " + notch + " cm ";
	}



	public double getNotch() {
		return notch;
	}

	@Override
	protected int getDaysForReturn() {
		return 0;
	}
 
    
}