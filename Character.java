public abstract class Character {
	protected String name;
	protected int life;
	protected int strength;
	protected int defense;
	protected double attack_rating;

public boolean isAlive () {
	if (life > 0) {return true;}
	else {return false;}
}
public int getDefense() {
	return defense;}
public String getName() {
	return name;}
public void lowerHP(int x){
	life= life- x ;}
public int attack (Character x){
	int damage = (int)((strength * attack_rating) - x.getDefense());
	x.lowerHP(damage);
	return damage;
	}
public void specialize();
public abstract void normalize();
public static String about();
}
