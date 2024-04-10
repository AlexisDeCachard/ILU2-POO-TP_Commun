package model;

public class FormulaireSpectacle extends Formulaire {
	private int numZone;
	private int numPlace=0;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour,mois);
		this.numZone=numZone;
	}

	public int getIdentificationEntite() {
		return numPlace;
	}

	public void setIdentificationEntite(int numPlace) {
		this.numPlace = numPlace;
	}

	public int getNumZone() {
		return numZone;
	}
	
	public int getJour() {
		return super.getJour();
	}
	
	public int getMois() {
		return super.getMois();
	}
	
}
