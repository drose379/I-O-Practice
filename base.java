	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.File;
	import java.util.Scanner;

	//Create a class setFile where the user can create their own name for the list, they can pick whether it is a .html or .txt and the 
	//method will append the correct ending to the file, then assign it to a property.

class baseClass {

	Scanner getInput = new Scanner(System.in);

public static void main(String[] args) {
	baseClass base = new baseClass();
	MainCommandLoop router = new MainCommandLoop(base.getInput);
	router.run();
}

}