import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author s525074
 * The first argument will be a path to a filename containing sentences, one per line.
 * You can assume all characters are from the english language. E.g.
 * HELLO CODEEVAL
   This is some text
   
   hello codeeval
   this is some text
 */
public class Lowercase {

	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String  line ;
		while((line= reader.readLine())!=null){
			line = line.trim();
			line = line.toLowerCase();
			System.out.println(line);
		}
	}

}
