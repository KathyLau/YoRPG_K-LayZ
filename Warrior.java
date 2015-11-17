public class Warrior extends Character {
public Warrior (){
	life = 100;
	strength = 100;
	defense = 50;
	attack_rating = 0.4;}
public Warrior(String x){
	this();
	name = x;
}
public static String about(){
	return "Out hero is the Warrior";
}

public void specialize(){
	defense = defense - 1;
	attack_rating = attack_rating + 0.1;}
public void normalize(){
	defense = 50;
	attack_rating = 0.4;}

}


