package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FormulaireSpectacleTest {
	static FormulaireSpectacle formulaire;
	static final int ZONE = 3;
	static final int JOUR = 10;
	static final int MOIS = 12;
	static final int IDENTIFICATION_1 = 0;
	static final int IDENTIFICATION_2 = 2;

	@BeforeAll
	static void setUpBeforeClass() {
		formulaire = new FormulaireSpectacle(JOUR, MOIS, ZONE);
	}

	@Test
	void testFormulaireSpectacle() {
		assertNotNull(formulaire, "formulaire null");
	}

	@Test
	void testGetZone() {
		assertEquals(ZONE, formulaire.getNumZone(),"Le nombre de personnes devrait être " + ZONE);
	}

	@Test
	void getJour() {
		assertEquals(JOUR, formulaire.getJour(), "Le jour devrait être " + JOUR);
	}

	@Test
	void getMois() {
		assertEquals(MOIS, formulaire.getMois(), "Le mois devrait être " + MOIS);
	}

	@Test
	void setIdentificationEntite() {
		FormulaireSpectacle formulaire2 = new FormulaireSpectacle(JOUR, MOIS, ZONE);
		assertEquals(IDENTIFICATION_1, formulaire2.getIdentificationEntite(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_1);
		formulaire2.setIdentificationEntite(IDENTIFICATION_2);
		assertEquals(IDENTIFICATION_2, formulaire2.getIdentificationEntite(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_2);
	}

	@Test
	void getIdentificationEntite() {
		assertEquals(IDENTIFICATION_1, formulaire.getIdentificationEntite(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_1);
	}

}
