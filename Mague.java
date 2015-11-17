public class Mague extends Character{
public Mague (){
	life = 150;
	strength = (int)(Math.random()*35) + 65;
	defense = 20;
	attack_rating = 1.0;}
public Mague(String x){
	this();
	name = x;
}
public static String about(){
	return "This is Mague";
}
public void specialize(){
	defense = defense - 2;
	attack_rating = attack_rating + 0.2;}
public void normalize(){
	defense = 20;
	attack_rating = 0.3;}

}
