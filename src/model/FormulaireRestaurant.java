package model;

public class FormulaireRestaurant extends Formulaire  {
	private int numService;
	private int numTable=0;
	private int nbPersonnes;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour,mois);
		this.numService=numService;
		this.nbPersonnes=nbPersonnes;
	}
	

	public int getNumService() {
		return numService;
	}

	public int getIdentificationEntite() {
		return numTable;
	}

	public void setIdentificationEntite(int numTable) {
		this.numTable = numTable;
	}

	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
	public int getJour() {
		return super.getJour();
	}
	
	public int getMois() {
		return super.getMois();
	}
	
}
