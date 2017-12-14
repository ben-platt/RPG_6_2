public class Terry extends Protagonist {

    public Terry() {
	super("");
	name = "Terry";
	defense = 60;
    }

    public String toString() {
	return "Terry: " + System.lineSeparator() +
	    "My special ability is that I'm very defensive: 60 to be exact";
    }
}
