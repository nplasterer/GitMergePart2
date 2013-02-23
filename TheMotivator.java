import java.util.ArrayList;


public class TheMotivator {
	private ArrayList<String> events = new ArrayList<String>();
	
	public void thoughtfortheday(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("On the other hand you have different fingers");
	}
	
	public void upcomingEvents(){
		System.out.println("Upcoming Events - Please join us!");
		for (String event : events)
			System.out.println(event);
	}
	
	public void createEvents() {
		events.add("We're going to a movie on Saturday");
		events.add("Study session on TODAY - Jim's house");
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.thoughtfortheday(60);
		tm.createEvents();
	}
}