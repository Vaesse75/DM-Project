/**
 * Filename: Game.java
 * Description: The core of the program to which all other modules report.
 * 
 * @author Vaesse
 * @version 0.0.2
 */

import javax.swing.JFileChooser;
import java.util.Scanner;

public class Game
{
	public static void main (String[] args) 
	{
		try
		{
			JFileChooser chooser = new JFileChooser("./Modules/");
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			// chooser.setMultiSelectionEnabled(true); // To chose more than one module... later.
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) 
			{
				// read name from file and confirm ruleset not filename
				System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
					
				Scanner myReader = new Scanner(chooser.getSelectedFile());
				String data = "";
				while (myReader.hasNextLine()) 
				{
					data += myReader.nextLine();
				}
				System.out.println(data); // Will end up Json library parsing
				myReader.close();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}