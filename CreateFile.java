import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class CreateFile implements CommandInt {

	Scanner getInput = new Scanner(System.in);

	String fileName;
	String ending;
	String directory;
	File writeable;

	public void execute() {
		System.out.println("What would you like to name the file?");
		fileName = getInput.nextLine();
		addEnding();
		getDirectory();
		addFile();
	}

	public void addEnding() {
		System.out.println("Which format would you like to save the file as? .txt or .html");
		ending = getInput.nextLine();
		fileName = fileName + ending;
		System.out.println(fileName);
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

	//Call methods from execute that prompt user for File name and File Type. 
	//After name and type are entered, direct them to a class that allows them to add content to the file
	/*
	Once file is created with ending, save its name as static so it can be accessed anywhere. If it is still null later in program,
	Call this class.
	*/
}