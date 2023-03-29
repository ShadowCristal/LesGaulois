package personnages;
import java.util.Random;

public class Druide {
	
		private String nom;
		private int effetPotionMin;
		private int effetPotionMax;
		private int forcePotion = 1;
		
		public Druide(String nom, int effetPotionMin, int effetPotionMax) {
			this.nom = nom;
			this.effetPotionMin = effetPotionMin;
			this.effetPotionMax = effetPotionMax;
			parler("Bonjour, je suis le druide " + nom + "et ma potion peut aller"+
					"d'une force " + effetPotionMin + " à "
					+ effetPotionMax + ".");
		}
		
		public String getNom() {
			return nom;
		}
		
		public int getEffetPotionMin() {
			return effetPotionMin;
		}
		
		public int getEffetPotionMax() {
			return effetPotionMax;
		}
		
		public void parler(String texte) {
			System.out.println(prendreParole() + "« " + texte + "»");
		}
		
		public int préparerPotion(int effetPotionMin, int effetPotionMax) {
			System.out.println("Je vais aller une petite Potion");
			Random puissancePotion = new Random();
			forcePotion = puissancePotion.nextInt(effetPotionMin,effetPotionMax);
			if (forcePotion > 7) {
				System.out.println("J'ai préparé une super potion de force " + forcePotion);
			}else {
				System.out.println("Je n'ai pas trouvé tout les ingrédients, "
						+ "ma potion est seulement de force " + forcePotion);
			}
			return forcePotion;
			
		}
		
		
		public void booster(Gaulois gaulois) {
			if (gaulois.getNom() == "Obélix") {
				System.out.println("Non, Obélix !... Tu n’auras pas de potion\r\n"
						+ "magique ! ");
			}
		}
		
		private String prendreParole() {
			return "Le druide " + nom + " : ";
		}
		
		
		
		public static void main(String[] args) {
			Druide panoramix = new Druide("Panoramix",5,10);
			panoramix.préparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
			panoramix.préparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
			panoramix.préparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
			panoramix.préparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
			panoramix.préparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
			
		}

}
