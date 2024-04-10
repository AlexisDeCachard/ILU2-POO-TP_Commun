package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReservationRestaurantTest {
	static ReservationRestaurant reservation;
	static ReservationHotel reservationH;
	static ReservationSpectacle reservationS;
	static final int NUM_TABLE = 2;
	static final int NUM_SERVICE = 1;
	static final int JOUR = 10;
	static final int MOIS = 12;
	static final int ZONE = 2;
	static final int CHAISE = 12;
	static final int LITSSIMPLES = 1;
	static final int LITSDOUBLES = 2;
	static final int CHAMBRE = 130;
	static final String MESSAGE_RESA_1 = "Le 10/12\nTable 2 pour le premier service.";
	static final String MESSAGE_RESA_2 = "Le 14/12\nTable 3 pour le deuxième service.";
	static final String MESSAGE_RESAH_1 = "Le 10/12\nChambre 130 avec 1 lit(s) simple(s) et 2 lit(s) double(s).";
	static final String MESSAGE_RESAH_2 = "Le 14/12\nChambre 22 avec 2 lit(s) simple(s) et 0 lit(s) double(s).";
	static final String MESSAGE_RESAS_1 = "Le 10/12\nChaise 12 dans la zone n°2.";
	static final String MESSAGE_RESAS_2 = "Le 14/12\nChaise 25 dans la zone n°4.";
	
	@BeforeAll
	static void setUpBeforeClass() {
		reservation = new ReservationRestaurant(JOUR, MOIS, NUM_SERVICE, NUM_TABLE);
		reservationH = new ReservationHotel(JOUR, MOIS, LITSSIMPLES, LITSDOUBLES, CHAMBRE);
		reservationS = new ReservationSpectacle(JOUR, MOIS, ZONE, CHAISE);
	}

	@Test
	void testToString() {
		assertEquals(MESSAGE_RESA_1, reservation.toString(), "la sortie console devrait etre : " + MESSAGE_RESA_1);
		Reservation reservation2 = new ReservationRestaurant(14, 12, 2, 3);
		assertEquals(MESSAGE_RESA_2, reservation2.toString(), "la sortie console devrait etre : " + MESSAGE_RESA_2);
		assertEquals(MESSAGE_RESAH_1, reservationH.toString(), "la sortie console devrait etre : " + MESSAGE_RESAH_1);
		Reservation reservationH2 = new ReservationHotel(14, 12, 2, 0, 22);
		assertEquals(MESSAGE_RESAH_2, reservationH2.toString(), "la sortie console devrait etre : " + MESSAGE_RESAH_2);
		assertEquals(MESSAGE_RESAS_1, reservationS.toString(), "la sortie console devrait etre : " + MESSAGE_RESAS_1);
		Reservation reservationS2 = new ReservationSpectacle(14, 12, 4, 25);
		assertEquals(MESSAGE_RESAS_2, reservationS2.toString(), "la sortie console devrait etre : " + MESSAGE_RESAS_2);
		
	}

	@Test
	void testReservationRestaurant() {
		assertNotNull(reservation, "reservationRestaurant null");
		assertNotNull(reservationH, "reservationHotel null");
		assertNotNull(reservationS, "reservationSpectacle null");
	}

}
