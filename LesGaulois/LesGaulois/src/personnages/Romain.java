package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
	this.nom = nom;
	assert force > 0;
	this.force = force;
	equipements = new Equipement[2];
	
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case(2):
			System.out.println("Le soldat "+ getNom() + "  est déjà bien protégé ! ");
		break;
		case(1):
			if (equipement == equipements[0]) {
				System.out.println("Le soldat "+ getNom() + " possède déjà l'equipement "
			+ equipement.toString() + " !");
			}
			else {
				equipements[nbEquipement] = equipement;
				nbEquipement += 1;
				System.out.println("Le soldat "+ getNom() + " s'équipe de l'équipement "
				+ equipement.toString() + " !");}
		break;
		default:
			equipements[nbEquipement] = equipement;
			nbEquipement += 1;
			System.out.println("Le soldat "+ getNom() + " s'équipe de l'équipement "
			+ equipement.toString() + " !");
		break;
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force > forceCoup;
	}
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	
	public static void main(String[] args) {
		Romain cesar = new Romain( "César", 5);
		System.out.println(cesar);
		System.out.println(cesar.prendreParole());
		cesar.parler("je suis fort");
		cesar.recevoirCoup(1);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.BOUCLIER);
	}

}
