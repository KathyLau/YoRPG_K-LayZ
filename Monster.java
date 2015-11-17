public class Monster extends Character{
public Monster (){
	life = 100;
	strength = (int)(Math.random()*35) + 65;
	defense = 20;
	attack_rating = 0.3;}
public Monster(String x){
	this();
	name = x;
}
public static String about(){
	return "Be ware of the Monster!";
}
public void specialize(){
	defense = defense - 2;
	attack_rating = attack_rating + 0.2;}
public void normalize(){
	defense = 20;
	attack_rating = 0.3;}

}
