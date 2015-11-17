public class Rogue extends Character{
public Rogue (){
	life = 150;
	strength = (int)(Math.random()*35) + 65;
	defense = 20;
	attack_rating = 0.3;}
public Rogue(String x){
	this();
	name = x;
}
public static String about(){
	return "This is Rogue!";
}
public void specialize(){
	defense = defense - 2;
	attack_rating = attack_rating + 0.2;}
public void normalize(){
	defense = 20;
	attack_rating = 0.3;}

}
