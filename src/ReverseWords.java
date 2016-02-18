import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReverseWords {

	public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line ;
        
        while((line = buffer.readLine()) != null){
        	line = line.trim();
        	String[] lineArray = line.split("\\s+");
        	for(int i= lineArray.length-1;i>=0;i--)
        	{
        		System.out.print(lineArray[i]+" ");
        	}
        	System.out.println(); 
        }
        
	}

}
