import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

class EditFile implements CommandInt {

	Scanner getInput = new Scanner(System.in);

	public void EditFile() {

	}

	public void execute() {
		System.out.println("Welcome to the editor!");
		System.out.println("Please specify the file you would like to edit.");
	}
}