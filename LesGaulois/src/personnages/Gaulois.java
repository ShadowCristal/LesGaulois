package personnages;




public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	
	public void parler(String name, String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole(){
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
		}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + 
		effetPotion +" fois décuplée.");
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois( "Astérix", 8);
		Druide panoramix = new Druide("Panoramix",5,10);
		int potion = panoramix.préparerPotion(5,10);
		asterix.boirePotion(potion);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler(asterix.getNom(), "je suis fort");
				
	}
}
