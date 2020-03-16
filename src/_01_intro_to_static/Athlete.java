package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber = 0;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber = nextBibNumber;
        nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete a = new Athlete("Jason", 100);
    	System.out.println(a.name);
    	System.out.println(a.bibNumber);
    	System.out.println(a.raceLocation);
    	
    	
    	Athlete b = new Athlete("Mark", 50);
        //print their names, bibNumbers, and the location of their race.
    	System.out.println(b.name);
    	System.out.println(b.bibNumber);
    	System.out.println(b.raceLocation);
    }
}
