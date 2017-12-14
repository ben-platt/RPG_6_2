public class Brutus extends Protagonist {
    public Brutus() {
	super("");
	name = "Brutus";
	HP = 400; //100 more than regular
    }

    public String toString() {
	return "Brutus: " + System.lineSeparator() +
	    "My special ability is smash: 400 SMASH!";
    }

}
