package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fournisseurs.FournisseursFarine;

class FournisseursFarineTest {

	@Test
	void testPassage() {
		FournisseursFarine ff=new FournisseursFarine("Grands Moulins de Paris","farine",10);
		assertEquals("1 fois par semaine", ff.passage());
		
	}

}
