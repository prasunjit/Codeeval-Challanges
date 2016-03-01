import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 * @author s525074
 * 
 * (--9Hello----World...--)
   Can 0$9 ---you~
   13What213are;11you-123+138doing7
   
   output
   hello world
   can you
   what are you doing
 * 
 *
 */
public class CleanUpWords {
       
	public static void main(String[] args) throws IOException{
		Stack stack = new Stack();
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line ;
		while((line=reader.readLine())!= null){
			line = line.trim();
			cleanUpLine(line);
		}
		
	}

	private static void cleanUpLine(String line) {
		StringBuffer cleanedLine = new StringBuffer();
		for(int i=0;i<line.length()-1;i++){
			//char inputChar = line.charAt(i);
			if(line.charAt(i)<128){
				cleanedLine.append(line.charAt(i));
			}
		}
		System.out.println(cleanedLine);
		
	}

}
