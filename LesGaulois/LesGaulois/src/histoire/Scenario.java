package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois( "Astérix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Romain minus = new Romain( "Minus", 7);
		Druide panoramix = new Druide("Panoramix",5,10);
		int potion = panoramix.préparerPotion(panoramix.getEffetPotionMin(),panoramix.getEffetPotionMax());
		panoramix.booster(obelix);
		obelix.parler(obelix.getNom(), "Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(potion);
		asterix.parler(asterix.getNom(), "Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
