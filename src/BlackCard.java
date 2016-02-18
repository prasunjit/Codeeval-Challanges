import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class BlackCard {

	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] inputArray;
        while((line = buffer.readLine())!= null){
        	line = line.trim();
        	inputArray = line.split("|");
        }
        
	}

}
