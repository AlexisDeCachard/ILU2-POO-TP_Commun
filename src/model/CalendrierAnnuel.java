package model;


public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier=new Mois[12];
		calendrier[0]=new Mois("Janvier",31);
		calendrier[1]=new Mois("Février",28);
		calendrier[2]=new Mois("Mars",31);
		calendrier[3]=new Mois("Avril",30);
		calendrier[4]=new Mois("Mai",31);
		calendrier[5]=new Mois("Juin",30);
		calendrier[6]=new Mois("Juillet",31);
		calendrier[7]=new Mois("Aout",31);
		calendrier[8]=new Mois("Septembre",30);
		calendrier[9]=new Mois("Octobre",31);
		calendrier[10]=new Mois("Novembre",30);
		calendrier[11]=new Mois("Décembre",31);
	}
	
	public boolean estLibre(int jour, int mois) {
		if (mois>12 || mois<1) {
			throw new IllegalStateException("Il n'existe que 12 mois de l'année, de 1 à 12 !");
		}
		Mois moisactu=calendrier[mois-1];
		int nbjoursmois=moisactu.jours.length;
		if (jour>nbjoursmois || jour<1) {
			throw new IllegalStateException("Il n'y a que " + nbjoursmois + " dans ce mois !");
		}
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		boolean libre=estLibre(jour, mois);
		if (libre) {
			calendrier[mois-1].reserver(jour);
		}
		return libre;
	}
	
	
	//****************CLASSE INTERNE****************//
	
	private static class Mois{
		private String nom;
		private boolean[] jours;

	private Mois(String nom, int nbJours) {
		this.nom=nom;
		this.jours=new boolean[nbJours];
		for (int i = 0; i < jours.length; i++) {
			jours[i]=false;
		}
	}
	
	private boolean estLibre(int jour) {
		if (jour>jours.length || jour<1) {
			throw new IllegalStateException("Il n'y a que " + jours.length + " dans ce mois !");
		}
		return !jours[jour-1];
	}
	
	private void reserver(int jour){
		if (!estLibre(jour)) {
			throw new IllegalStateException("Le " + jour + " " + nom + " est déjà réservé !");
		}
		else{
			jours[jour-1]=true;
		}
	}
	
	}
}
