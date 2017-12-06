public class Monster extends Character{
    public Monster(){
        HP = 150;
        strength = (int) (Math.random() * 45 + 20);
        defense = 20;
        attack = 1.0;
    }

    public String toString(){
      return  "HP: " + HP +
              "\nstrength: "  + strength +
              "\ndefense: "   + defense +
              "attack: "      + attack;
    }
}
