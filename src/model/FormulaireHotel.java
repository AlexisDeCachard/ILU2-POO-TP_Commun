package model;

public class FormulaireHotel extends Formulaire  {
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numChambre=0;
	
	public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
		super(jour,mois);
		this.nbLitsSimples=nbLitsSimples;
		this.nbLitsDoubles=nbLitsDoubles;
	}

	public int getIdentificationEntite() {
		return numChambre;
	}

	public void setIdentificationEntite(int numChambre) {
		this.numChambre = numChambre;
	}

	public int getNbLitsSimples() {
		return nbLitsSimples;
	}

	public int getNbLitsDoubles() {
		return nbLitsDoubles;
	}
	
	public int getJour() {
		return super.getJour();
	}
	
	public int getMois() {
		return super.getMois();
	}

}
