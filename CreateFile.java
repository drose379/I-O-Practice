import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

class CreateFile implements CommandInt {

	Scanner getInput = new Scanner(System.in);

	String fileName;
	String directory;

	int errorCount = 3;

	File writeable;

	public void execute() {
		System.out.println("What would you like to name the file?");
		fileName = getInput.nextLine();
		this.addEnding();
		this.getDirectory();
		this.addFile();
	}

	public void addEnding() {

		System.out.println("Which format would you like to save the file as? .txt or .html");
		
		Set<String> vals = new HashSet<>();
		vals.add(".html");
		vals.add(".txt");

		String input = getInput.nextLine();

		if (vals.contains(input) ) {
			fileName = fileName + input;
		}
		else {
			if (errorCount > 0) {
				System.out.println(errorCount + " tries left!");
				errorCount--;
				addEnding();
			}
			else {
				System.out.println("Out of tries!");
				System.exit(0);
			}
		}

	}

	public void getDirectory() {
		System.out.println("Where would you like to save the documents? (Just enter a folder name, no '/' necessary)");
		directory = getInput.nextLine();
		directory = directory + "/";
	}

	public void addFile() {
		writeable = new File(directory + fileName);
		try {
			if (writeable.createNewFile()) {
				System.out.println("File " + fileName + " has been saved in " + directory);
				EditFile editor = new EditFile();
				editor.execute();
			}
			else {
				System.out.println("File could not be saved, please try again");
				execute();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	//After name and type are entered, direct them to a class that allows them to add content to the file

}