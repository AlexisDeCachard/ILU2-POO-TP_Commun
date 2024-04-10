package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FormulaireHotelTest {
	static FormulaireHotel formulaire;
	static final int NB_LITS_SIMPLES = 2;
	static final int NB_LITS_DOUBLES = 1;
	static final int JOUR = 10;
	static final int MOIS = 12;
	static final int IDENTIFICATION_1 = 0;
	static final int IDENTIFICATION_2 = 22;
	
	@BeforeAll
	static void setUpBeforeClass() {
		formulaire = new FormulaireHotel(JOUR, MOIS, NB_LITS_SIMPLES, NB_LITS_DOUBLES);
	}
	
	@Test
	void testFormulaireHotel() {
		assertNotNull(formulaire, "formulaire null");
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
	void testGetIdentificationEntite() {
		assertEquals(IDENTIFICATION_1, formulaire.getIdentificationEntite(),"L'identification du formulaire devrait être " + IDENTIFICATION_1);
	}

	@Test
	void setIdentificationEntite() {
		FormulaireHotel formulaire2 = new FormulaireHotel(JOUR, MOIS, NB_LITS_SIMPLES, NB_LITS_DOUBLES);
		assertEquals(IDENTIFICATION_1, formulaire2.getIdentificationEntite(),
				"L'identification du formulaire devrait être " + IDENTIFICATION_1);
		formulaire2.setIdentificationEntite(IDENTIFICATION_2);
		assertEquals(IDENTIFICATION_2, formulaire2.getIdentificationEntite(),"L'identification du formulaire devrait être " + IDENTIFICATION_2);
	}

	@Test
	void testGetNbLitsSimples() {
		assertEquals(NB_LITS_SIMPLES, formulaire.getNbLitsSimples(),"Le nombre de personnes devrait être " + NB_LITS_SIMPLES);
	}

	@Test
	void testGetNbLitsDoubles() {
		assertEquals(NB_LITS_DOUBLES, formulaire.getNbLitsDoubles(),"Le nombre de personnes devrait être " + NB_LITS_DOUBLES);
	}

}
