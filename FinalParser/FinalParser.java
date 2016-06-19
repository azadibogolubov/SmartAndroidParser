import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FinalParser {
	int count;
	ArrayList<String> currentElement;
	ArrayList<String> types;

	public FinalParser(String fileName) {
				count = 0;
		currentElement = new ArrayList<String>();
		types = new ArrayList<String>();
		types.add("LinearLayout");
		types.add("RelativeLayout");
		types.add("TextView");
		types.add("EditText");

		System.out.println("Converting your code to Android XML...");

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		    String line;
		    boolean nestedElement = false;
		    String[] currentLine = null;
		    while ((line = br.readLine()) != null) {
		    	if (line.contains("\t")) {
		    		currentLine = line.split("\t");
		    		currentElement.add(currentLine[1]);
		    		System.out.println("After tab: " + currentLine[1]);
		    	}
		    	if (currentLine != null && line.equals(types.get(0)))
		    	{
		    		processType("LinearLayout");
			    	count++;
		       }
		       else if (line.equals(types.get(0))) {
		      		processType("LinearLayout");
		      		count++;
		       }
		    }
		}
		catch (IOException e) {
			System.out.println("File not found: " + fileName);
		}
		System.out.println("Number of elements: " + count);	
	}

	public static void main(String[] args) {
		FinalParser parser = new FinalParser(args[0]);
	}

	public void processType(String type) {
		switch (type) {
			case "LinearLayout":
				System.out.println("<LinearLayout\n\tandroid:layout_width=\"wrap_content\"\n\tandroid:layout_height=\"wrap_content\">\n</LinearLayout>");
				break;
			default: 
				System.out.println("Invalid type");
				break;
		}
	}
}