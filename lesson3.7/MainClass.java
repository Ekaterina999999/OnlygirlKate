import java.util.ArrayList;
import java.util.Collection;

public class MainClass {
	public static void main (String[] args) throws NoSuchMethodException {
	    double sum = 0;
	    double maxPower = 0;
	    double hdd = 0;
	    int count = 0;
	    Returnable returnable;
	    
	    AbstractItem[] matrix = new AbstractItem[300];
	    ArrayList<Object> matrix2 = new ArrayList<Object>();
	    
	    AbstractItem laptop1 = new Laptops("HP", 39800, 10, 1000, 4, 5, 15.6, 8);
        AbstractItem laptop2 = new Laptops("Apple", 100500, 14, 1000, 5, 8, 15, 9);
        
        matrix[0] = laptop1;
        matrix[1] = laptop2;
        
        matrix2.add( laptop1);
        matrix2.add(laptop2);
        
        
        AbstractItem monoblock1 = new Monoblocks("HP", 55000, 47, 12, 89, 78);
        AbstractItem monoblock2 = new Monoblocks("Dexp", 78999, 27, 62, 79, 89);
        
        matrix[2] = monoblock1;
        matrix[3] = monoblock2;
        
        matrix2.add( monoblock1);
        matrix2.add( monoblock2);
        
        
        AbstractItem saw1 = new Saws("NumberSaw1", 12334, 10, 160, 53);
        AbstractItem saw2 = new Saws("NumberSaw2", 1500, 14, 1000, 5);
        
        matrix[4] = saw1;
        matrix[5] = saw2;
        
        matrix2.add(saw1);
        matrix2.add(saw1);
                
        AbstractItem drill1 = new Drills("NumberDrill1", 3800, 10, 100, 4);
        AbstractItem drill2 = new Drills("NumberDrill2", 1300, 14, 40, 5);
        
        matrix[6] = drill1;
        matrix[7] = drill2;
        
        matrix2.add(drill1);
        matrix2.add(drill1);
                
        AbstractItem jigsaw1 = new Jigsaws("NumberJig1", 8500, 10, 1000, 4);
        AbstractItem jigsaw2 = new Jigsaws("NumberJig2", 1550, 14, 1000, 5);
        
        matrix[8] = jigsaw1;
        matrix[9] = jigsaw2;
        
        matrix2.add(jigsaw1);
        matrix2.add(jigsaw1);
        
        /*for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                System.out.println(matrix[i]);
          }
      }*/
        for (int i = 0; i < 9; i++) {
            
        	System.out.println(matrix[i]);
            
            sum += matrix[i].getCount() * matrix[i].getQuantity();
            
            //Maximum power
            
            if (matrix[i] instanceof Elinstrument) {
                Elinstrument iter = (Elinstrument)matrix[i];
                if (maxPower <= iter.getPowerConsum()) {
                    maxPower = iter.getPowerConsum();
                    count = i;
                }
            }
            
            //The amount of hard disk space
            
            if (matrix[i] instanceof Computers) {
                Computers iter = (Computers)matrix[i];
                hdd += iter.getHdd();
            }
            
           
        }
        
        System.out.println("__________________________________________________________________");
        
		for (int i = 0; i < matrix2.size(); i++) {
        	if (((AbstractItem) matrix2.get(i)).getDaysForReturn() != 0){
        		System.out.println(((AbstractItem) matrix2.get(i)).getName() + " you can return within " 
        							+ ((AbstractItem) matrix2.get(i)).getDaysForReturn() + " days. " + ((AbstractItem) matrix2.get(i)).getRequiredDocuments());
        	}
        }
       
		System.out.println("__________________________________________________________________");
		
        //System.out.println(matrix[0].getDaysForReturn());
        System.out.println("\n" + " The amount that the store will earn = " + sum + " rub "+ 
        		           "\n" + "Maximum power " + maxPower + " It's  "+ matrix[count] + 
        		           "\n" + "The amount of hard disk space " + hdd);
       
    }
}
