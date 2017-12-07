public class Protagonist extends Character{
    protected String name;
    public Protagonist(String input){
        name = input;
        HP = 300;
        strength = 100;
        defense = 35;
        attack = 0.4;
    }

    public void specialize(){
      	attack = attack * 2;
      	defense = defense / 2 - 5;
    }

    public void normalize(){
      	this.attack = 0.4;
        this.defense = 35;
    }

    public String getName(){
	return name;
    }

    public String toString() {
	return name + System.lineSeparator() +
	    "HP: " + HP + System.lineSeparator() +
	    "strength: " + strength + System.lineSeparator() +
	    "defense: " + defense + System.lineSeparator() +
	    "attack: " + (int) (attack * 100);
    }


}
