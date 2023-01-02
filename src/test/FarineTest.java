package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stocks.Farine;

class FarineTest {

	@Test
	void testPrixpargramme() {
		Farine farine = new Farine("farine",0);
		assertEquals(0.00165, farine.prixpargramme());
		
	}

}
