import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class MainCommandLoop {

	protected String input;
	Scanner scan;

	public MainCommandLoop(Scanner getInput) {
		scan = getInput;
	}

	public void run() {
		Map<String,CommandInt> map = new HashMap<>();
		map.put("New file", new CreateFile());
		map.put("Help", new HelpBot());
		map.put("Add to file",new EditFile());

		System.out.println("Welcome, please enter a command");
		System.out.println("Commands are:");
		System.out.println("-New file \n-Add to file\n-Help");

		input = scan.nextLine();

		if (map.containsKey(input)) {
			map.get(input).execute();
		}
		else {
			System.out.println("Command not found");
		}
	
	}

}
