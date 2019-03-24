import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
 
public class Main {
	
	//Use English layout only. Coding failed.
	
    public static void main(String[] args) throws FileNotFoundException, IOException {
    	
    	Scanner in = new Scanner(System.in);
    	int count;     
    	DateFormat df = new SimpleDateFormat(" HH:mm, d/MM/yy");
    	String date = df.format(Calendar.getInstance().getTime());
    	FileWriter writer = new FileWriter("C:\\Users\\Ekaterina\\eclipse-workspace\\ChatBot\\src\\test.txt", true);
    	
    	while (writer != null) {
    		// запись всей строки
            //String text = "Hello World!";
        	//System.out.print(date);
        	String text = in.nextLine();
        	writer.write(date + "\n");
            writer.write(text + "\n");
            System.out.print("\n");
            writer.flush();
            
            
    	File file = new File("C:\\\\Users\\\\Ekaterina\\\\eclipse-workspace\\\\ChatBot\\\\src\\\\test.txt");
        String result = ReadLastLine(file);
        if (result != null) {
           String res2 = (result.replaceAll("[\\?,\\!]", "."));
           res2 = (res2.replaceAll("\\s+",""));
           System.out.print(res2.toUpperCase() + date);
           //System.out.print(result.toUpperCase() + date);
           //System.out.println("value: " + result.substring(result.lastIndexOf(' ') + 10));
       } else System.out.println("file is empty");
            
           
       }
   }
    
    private static String ReadLastLine(File file) throws FileNotFoundException, IOException {
        String result = null;
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long startIdx = file.length();
            while (startIdx >= 0 && (result == null || result.length() == 0)) {
                raf.seek(startIdx);
                if (startIdx > 0) 
                    raf.readLine();
                result = raf.readLine();
                startIdx--;
            }
        }
        return result;
    }
    
}
