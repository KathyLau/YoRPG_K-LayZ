public class KingArthur extends Character{
public KingArthur (){
	life = 150;
	strength = (int)(Math.random()*35) + 65;
	defense = 20;
	attack_rating = 1.0;}
public KingArthur(String x){
	this();
	name = x;
}
public static String about(){
	return "Our king, our leader, our knight!";
}
public void specialize(){
	defense = defense - 1;
	attack_rating = attack_rating + 0.1;}
public void normalize(){
	defense = 20;
	attack_rating = 1.0;}

}
