package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {
	
	public static int sum(List<Integer> l) {
		
		int somme = 0;
		
		/*
		for(Integer i : l) {
			
			if(i != null) {
				somme+=i;
			}		
			
		}*/
		
		somme = l.stream().map(n -> n == null ? 0 : n).reduce(0, (a,b) -> a+b);
		
		return somme;
		
		
		
	}
	
	public static String emptyToNull(String s) {
		
		if(s == null) {
			
			return null;
			
		}
		
		return s.trim().equals("") ? null : s;
		
	}
	
	public static List<Integer> filterEvenNumbers(List<Integer> l){
		
		List<Integer> listePaire = new ArrayList<Integer>();
		
		/*for(Integer i : l) {
			
			if(i != null && i%2 == 0) {
				
				listePaire.add(i);
				
			}
			
		}*/
		
		listePaire = l.stream().filter(n -> n!=null && n%2 == 0).collect(Collectors.toList());
		
		return listePaire;
		
	}
	
	public static List<Float> transformSquarePlusPointFive(List<Integer> l){
		
		List<Float> nouvelleListe = new ArrayList<Float>();
		
		/*for(Integer i : l) {
			
			if(i==null) {
				
				nouvelleListe.add(null);
				
			}
			
			else {
				
				nouvelleListe.add((float) ((float) Math.pow(i, 2) + 0.5));
				
			}
		}*/
		
		nouvelleListe = l.stream().map(n -> n == null ? null : (float) n*n + 0.5f).collect(Collectors.toList());
		
		return nouvelleListe;
		
	}

}
