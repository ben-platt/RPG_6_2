public class Character{
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attack;
    
    public boolean isAlive(){
      	return HP > 0;
    }
    
    protected int getDefense(){
      	return defense;
    }

    protected void lowerHp(int damage){
      	HP -= damage;
    }

    public int attack(Character victim){
        int dealt = (int) (strength * attack - victim.getDefense());
        victim.lowerHp(dealt);
        return dealt;
    }
}
