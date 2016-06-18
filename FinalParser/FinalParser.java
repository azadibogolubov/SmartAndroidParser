import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FinalParser {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<String> types = new ArrayList<String>();
		types.add("LinearLayout");
		types.add("RelativeLayout");
		types.add("TextView");
		types.add("EditText");

		System.out.println("Converting your code to Android XML...");

		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	if (line.equals(types.get(0))) {
		    		System.out.println("<LinearLayout\n\tandroid:layout_width=\"wrap_content\"\n\tandroid:layout_height=\"wrap_content\">\n</LinearLayout>");
		    	}
		       	count++;
		    }
		}
		catch (IOException e) {
			System.out.println("File not found: " + args[0]);
		}
		System.out.println("Line count: " + count);	
	}
}