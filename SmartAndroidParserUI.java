import javax.swing.*;

public class SmartAndroidParserUI extends JFrame {
	JButton button;
	JTextArea textArea, outputFile;
	JLabel welcomeLbl, fileNameLbl;

	public SmartAndroidParserUI() {
		welcomeLbl = new JLabel("Welcome to Smart Android Parser");
		button = new JButton("Compile");
		fileNameLbl = new JLabel("Output file");
		textArea = new JTextArea(300, 25);
		outputFile = new JTextArea(300, 1);
		
		setSize(400, 400);
		setTitle("Smart Android Parser");
		setLayout(null);

		welcomeLbl.setSize(250, 30);
		welcomeLbl.setLocation(80, 10);

		textArea.setSize(400, 200);
		textArea.setLocation(0, 50);

		fileNameLbl.setSize(100, 30);
		fileNameLbl.setLocation(10, 250);

		outputFile.setSize(400, 20);
		outputFile.setLocation(0, 280);

		button.setSize(175, 30);
		button.setLocation(100, 300);

		add(welcomeLbl);
		add(textArea);
		add(fileNameLbl);
		add(outputFile);
		add(button);
		
		show();		
	}

	public static void main(String args[]) {
		new SmartAndroidParserUI();
	}
}