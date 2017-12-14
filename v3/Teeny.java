public class Teeny extends Protagonist {
    public Teeny() {
	super("");
	name = "Teeny";
	attack = .7;
    }

    public String toString() {
	return "Teeny: " + System.lineSeparator() +
	    "I'm real fast: I've got a .7 attack rating";
    }
    
}
