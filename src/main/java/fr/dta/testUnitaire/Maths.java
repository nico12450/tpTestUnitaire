package fr.dta.testUnitaire;

public class Maths {
	
	public static Long substract(Long n1, Long n2) throws NegativeNumberException {
		
		if(n1 == null) {
			
			n1 = 0L;
			
		}
		
		if(n2 == null) {
			
			n2 = 0L;
			
		}
		
		if(n1<0 || n2<0 || n1-n2<0) {
			
			throw new NegativeNumberException();
		}
		
		return n1-n2;
	}

}
