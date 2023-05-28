package flow.control;

public class Hello {

	public static void main(String[] args) {
		String name = "Team";

		switch (name) {
		case "author" :
			System.out.println("Adam");
			break;
		case "team" :
			System.out.println("Team Mawya");
			break;
		case "editor":
			System.out.println("AdamYaM");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
		
		switch (name.toLowerCase()) {
		case "author" :
			System.out.println("Adam");
			break;
		case "team" :
			System.out.println("Team Mawya");
			break;
		case "editor":
			System.out.println("AdamYaM");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}

	}

}
