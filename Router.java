import java.util.Map;
import java.util.HashMap;

class Router {

	Map<String,CommandInt> map;

	String input;

	public Router(String input) {
		this.input = input;
		map = new HashMap<>();
		map.put("New file", new CreateFile());
		map.put("Help", new HelpBot());
	}

	public void run() {
		if (map.containsKey(input)) {
			map.get(input).execute();
		}
		else {
			System.out.println("The command " + input + " could not be found!");
		}
	}


}