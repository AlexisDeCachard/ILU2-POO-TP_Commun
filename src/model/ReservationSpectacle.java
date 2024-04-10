package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour,mois);
		this.numZone=numZone;
		this.numChaise=numChaise;
	}
	
	public String toString() {
		return super.toString() + " Chaise n°" + numChaise + " dans la zone n°" + numZone;
	}
}
