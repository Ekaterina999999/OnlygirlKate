import java.util.Random;

public class MainClass {

	private static Random random;
	
	private static boolean getRandomBoolean() {
		return random.nextBoolean();	
	}
	
	public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {
		
		random = new Random();

		Player pl1 = new Player("One", true);
		Player pl2 = new Player("Two", false);
		Player pl3 = new Player("Three", true);
		Player pl4 = new Player("Four", null);
		Player pl5 = new Player("Five", true);
		
		Player[] matrix = { pl1, pl2, pl3, pl4, pl5 };
		
		for (int i = 0; i < matrix.length; i++) {
			boolean random = getRandomBoolean();
			
			if (matrix[i].isCondition() == null) {
				throw new MiJeDogovarivalisDomaNePryatatsaException(matrix[i].getName());
				
			} else if (matrix[i].isCondition() == random) {
				matrix[i].setResult(false);
				
			} else {
				matrix[i].setResult(true);
			}
			
			
			
		for (int i1 = 0; i1 < matrix.length; i1++) {
			if (matrix[i1].isResult())
					System.out.println(matrix[i1] + " win");
			}
			
		for (int i1 = 0; i1 < matrix.length; i1++) {
			if (!matrix[i1].isResult())
				System.out.println(matrix[i1] + " lose");
			}
	    }
	}
}

