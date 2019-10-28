package utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyUtilsTest {
	
	private List<Integer> listeEntiers;
	

	@Test
	public void testSum() {
		
		listeEntiers = new ArrayList<Integer>();
		
		listeEntiers.add(5);
		listeEntiers.add(10);
		listeEntiers.add(8);
		listeEntiers.add(1);
		listeEntiers.add(2);
		
		assertEquals(MyUtils.sum(listeEntiers),5+10+8+1+2);
		
	}
	
	@Test
	public void testSumWithEmpty() {
		
		listeEntiers = new ArrayList<Integer>();
		
		assertEquals(MyUtils.sum(listeEntiers), 0);
		
	}
	
	@Test
	public void testSumWithNull() {
		
		listeEntiers = new ArrayList<Integer>();
		
		listeEntiers.add(null);
		
		assertEquals(MyUtils.sum(listeEntiers), 0);
		
	}
	
	@Test
	public void testEmptyToNull() {
		
		String s = "test";
		
		assertEquals(MyUtils.emptyToNull(s),s);
		
	}
	
	@Test
	public void testEmptyToNullWithEmpty() {
		
		String s = " ";
		
		assertEquals(MyUtils.emptyToNull(s), null);
		
	}
	
	@Test
	public void testEmptyToNullWithNull() {
		
		String s = null;
		
		assertEquals(MyUtils.emptyToNull(s), null);
		
	}
	
	@Test
	public void testFilterEvenNumbers() {
		
		listeEntiers = new ArrayList<Integer>();
		
		listeEntiers.add(5);
		listeEntiers.add(10);
		listeEntiers.add(8);
		listeEntiers.add(7);
		listeEntiers.add(2);
		
		List<Integer> listeAttendue = new ArrayList<Integer>();
		
		listeAttendue.add(10);
		listeAttendue.add(8);
		listeAttendue.add(2);
		
		assertEquals(MyUtils.filterEvenNumbers(listeEntiers), listeAttendue);
		
	}
	
	@Test
	public void testFilterEvenNumbersWithEmpty() {
		
		listeEntiers = new ArrayList<Integer>();

		assertEquals(MyUtils.filterEvenNumbers(listeEntiers), listeEntiers);
		
	}
	
	@Test
	public void testFilterEvenNumbersWithNull() {
		
		listeEntiers = new ArrayList<Integer>();
		listeEntiers.add(null);

		assertEquals(MyUtils.filterEvenNumbers(listeEntiers), new ArrayList<Integer>());
		
	}
	
	@Test
	public void testTransformSquarePlusPointFive() {
		
		listeEntiers = new ArrayList<Integer>();
		
		listeEntiers.add(5);
		listeEntiers.add(10);
		listeEntiers.add(8);
		
		List<Float> listeAttendue = new ArrayList<Float>();
		
		listeAttendue.add(25.5f);
		listeAttendue.add(100.5f);
		listeAttendue.add(64.5f);
		
		assertEquals(MyUtils.transformSquarePlusPointFive(listeEntiers), listeAttendue);	
		
	}
	
	@Test
	public void testTransformSquarePlusPointFiveWithEmpty() {
		
		listeEntiers = new ArrayList<Integer>();
		
		assertEquals(MyUtils.transformSquarePlusPointFive(listeEntiers), new ArrayList<Float>());	
		
	}
	
	@Test
	public void testTransformSquarePlusPointFiveWithNull() {
		
		listeEntiers = new ArrayList<Integer>();
		listeEntiers.add(null);
		
		List<Float> listeAttendue =  new ArrayList<Float>();
		listeAttendue.add(null);
		
		assertEquals(MyUtils.transformSquarePlusPointFive(listeEntiers),listeAttendue);	
		
	}
	

}
