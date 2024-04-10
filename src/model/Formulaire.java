package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	
	protected Formulaire(int jour, int mois) {
		this.jour=jour;
		this.mois=mois;
	}

	protected int getJour() {
		return jour;
	}

	protected int getMois() {
		return mois;
	}
	
	

}
