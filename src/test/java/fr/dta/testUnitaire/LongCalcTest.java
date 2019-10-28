package fr.dta.testUnitaire;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongCalcTest {

	@Test
	public void testSubstractWithPositive() throws NegativeNumberException {
		//fail("Not yet implemented");
		
		Long n1 = 3L, n2 = 5L;
		
		assertEquals(Maths.substract(n2,n1), new Long(2));
		
	}
	
	@Test
	public void testSubstractWithNull() throws NegativeNumberException {
		//fail("Not yet implemented");
		
		Long n1 = null, n2 = 5L;
		
		assertEquals(Maths.substract(n2, n1), new Long(5));
		
	}
	
	@Test
	public void testSubstractWithNegativeResult(){
		//fail("Not yet implemented");
		
		Long n1 = 2L, n2 = 5L;
		
		try {
			Maths.substract(n1, n2);		
		}
		
		catch(NegativeNumberException e) {
			
			return;
			
		}
		
		fail("l'exception n'a pas été levée");
		
	}
	
	@Test(expected = NegativeNumberException.class)
	public void testSubstractWithNegativeOperator() throws NegativeNumberException{
		//fail("Not yet implemented");
		
		Long n1 = -2L, n2 = 5L;
		
		Maths.substract(n2,n1);		
	
	}

}
