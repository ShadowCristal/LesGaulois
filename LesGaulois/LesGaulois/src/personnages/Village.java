package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbMaxVillageois;
	
	public Village(String nom,int nbMaxVillageois) {
		this.nom = nom;
		this.nbMaxVillageois = nbMaxVillageois;
		villageois = new Gaulois[nbMaxVillageois];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	
	public void ajouterHabitant(Gaulois gaulois){
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
		
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];	
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		if (villageois.length == 0) {
			System.out.println(" - ");
		}		
		for (int i = 0; i < villageois.length; i++) {
			if (villageois[i] != null) {
			System.out.println("- "+ villageois[i].getNom());
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Village village = new Village( "Village des irréductibles", 30);
		Chef chef = new Chef("Abraracourix",6,village);
		Gaulois asterix = new Gaulois( "Astérix", 8);
		Gaulois obelix = new Gaulois( "Obélix", 25);
		
		//Gaulois gaulois = village.trouverHabitant(30)//
		
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		 *  Index 30 out of bounds for length 30
		at personnages.Village.trouverHabitant(Village.java:27)
		at personnages.Village.main(Village.java:34)*/
		
		//On obtient cette exception parceque l'index s'arrete à 29 et non à 30//
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		village.afficherVillageois(chef);
		

		
	}

}
