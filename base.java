	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.File;
	import java.util.Scanner;

	//Create a class setFile where the user can create their own name for the list, they can pick whether it is a .html or .txt and the 
	//method will append the correct ending to the file, then assign it to a property.

class baseClass {

	Scanner getInput = new Scanner(System.in);

	protected String input =  null;
	protected File outputFile = new File("text/output.html");

public static void main(String[] args) {
	baseClass base = new baseClass();
	System.out.println("Welcome! Enter a command.");
	System.out.println("Commands: ");
	System.out.println("'New file','Help'");
	Router router = new Router(base.getInput.nextLine());
	router.run();
}

public void getString() {
	System.out.println("Please enter the string that you would like to save!");
	input = getInput.nextLine();
	input = "<h4>" + input + "<h4>";
}

public void saveString() {
	try (
			FileWriter writer = new FileWriter(outputFile,true);
		) {
		writer.write(input);
	}
	catch (IOException e) {
		//Handle errors here
	} 
}


}