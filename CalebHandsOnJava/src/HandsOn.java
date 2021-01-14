import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("test.txt"));
		
		List<String> stds = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			stds.add(in.nextLine());
		}
		
		for (int i = 0; i < stds.size(); i++) {
			System.out.println("name: " + stds.get(i));
		}

		in.close();
		
		
	}
	
}
