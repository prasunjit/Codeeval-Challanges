import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		//String[] splittedInput = null;
		int x;
		int y;
		int n;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			// System.out.println(line);
			// splittedInput = new String[3];
			/*if (line.equals(""))
				continue;*/
			String[] splittedInput= line.split("\\s+");
			x = Integer.parseInt(splittedInput[0]);
			y = Integer.parseInt(splittedInput[1]);
			n = Integer.parseInt(splittedInput[2]);
			for (int i = 1; i <= n; i++) {

				if (i % (x * y) == 0) {
					System.out.print("FB ");
				}

				else {
					if (i % x == 0) {
						System.out.print("F ");
					}
					if (i % y == 0) {
						System.out.print("B ");
					}
					if (i % x != 0 && i % y != 0) {
						System.out.print(i + " ");
					}

				}
				
			}
			System.out.println();
		}
	}
}
