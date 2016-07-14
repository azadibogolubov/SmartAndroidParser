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
		    	System.out.println("Line = " + line);
		    	if (line.contains("\t")) {
		    		currentLine = line.split("\t");
		    		currentElement.add(currentLine[1]);
		    		System.out.println("After tab: " + currentLine[1]);
		    	}
		    	else  {
		    		currentLine = new String[] { "LinearLayout" };
		    	}
		    	System.out.println("CurrentLine = " + currentLine[0]);
		    	if (currentLine.length > 1) {
		    		System.out.println("CurrentLine[1] = " + currentLine[1]);
		    	}
		    	if (currentLine.equals(types.get(0)))
		    	{
		    		System.out.println("LL");
		    		processType("LinearLayout");
			    	count++;
		       }
		       else if (currentLine.equals(types.get(1))) {
		    		System.out.println("RL");
		      		processType("RelativeLayout");
		      		count++;
		       }
		       else if (currentLine.equals(types.get(2))) {
		       		System.out.println("TV");
		       		processType("TextView");
		       		count++;
		       }
		       else if (currentLine.equals(types.get(3))) {
		       		System.out.println("ET");
		       		processType("EditText");
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
			case "RelativeLayout":
				System.out.println("<RelativeLayout\n\tandroid:layout_width=\"wrap_content\"\n\tandroid:layout_height=\"wrap_content\">\n</RelativeLayout>");
				break;
			case "TextView":
				System.out.println("<TextView\n\tandroid:layout_width=\"wrap_content\"\n\tandroid:layout_height=\"wrap_content\">\n</TextView>");
				break;
			case "EditText":
				System.out.println("<EditText\n\tandroid:layout_width=\"wrap_content\"\n\tandroid:layout_height=\"wrap_content\">\n</EditText>");
				break;
			default: 
				System.out.println("Invalid type");
				break;
		}
	}
}