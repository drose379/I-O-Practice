import java.util.Scanner;

class HelpBot implements CommandInt {

	Scanner getInput = new Scanner(System.in);

	public void execute() {
		System.out.println("Commands available to you are: 'New file' and 'Help'");
		System.out.println("Enter a command");
		Router router = new Router(getInput.nextLine());
		router.run();
	}


}