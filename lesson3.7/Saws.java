
public class Saws extends Elinstrument implements Returnable {

	private int radius;

    public Saws(String nameS, double countS, double quantityS, double powerConsumS, double radiusS) {
        name = nameS;
        count = countS;
        quantity = quantityS;
        powerConsum = powerConsumS;
        radius = radius;
    }
      
	@Override
	public String toString() {
		return "Saw " + " " + name + " " + count + "rub  " + quantity + " pieces " + radius + " cm ";
				
	}



	@Override
	public void getRequiredDocuments() {
		System.out.println("You need passport and check");
		
	}

	@Override
	public int getDaysForReturn() {
		return 21;
		}
}
