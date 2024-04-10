 package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.numService=numService;
		this.numTable=numTable;
	}
	
	public String toString() {
		if (numService==1) {
			return super.toString() + "Table " + numTable + " pour le premier service.";
		} else {
			return super.toString() + "Table " + numTable + " pour le deuxième service.";
		}
	}
}
