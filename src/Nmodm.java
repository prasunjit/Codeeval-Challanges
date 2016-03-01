import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Nmodm {

	public static void main(String[] args)throws IOException {
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line = reader.readLine())!= null){
        	line = line .trim();
        	String[] lineArray = line.split(",");
        	int N = Integer.parseInt(lineArray[0]);  //20
        	int M = Integer.parseInt(lineArray[1]);  //6
        	
        	//calculate N mod M now  20 mod 6 = 2
        	int divident = N / M;
        	int zeroRemainder = divident * M;
        	int remainder = N - zeroRemainder;
        	 
        	System.out.println(remainder);
        }

	}

}
