package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestKMMiles {

	@Test
	void test() {
		TestKMMilesEsame a = new TestKMMilesEsame();
		double b = a.convertKMMiles();
		assertTrue(b<5);;
	}

}
