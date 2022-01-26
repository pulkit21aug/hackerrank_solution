package com.puls.hackerrank;

public class AllPerutationsOfString {

	public static void main(String[] args) {
		
		String str = "abc";
		String asf="";
		permutations(str, asf);
				
	}
	
	public static void permutations(String ques, String asf) {
		
		if(ques.length()==0) {
			System.out.println(asf);
		
		}
		
		
		for(int i=0;i<ques.length();i++) {
			char ch =  ques.charAt(i);
			String lpartques = ques.substring(0,i);
			String  rpartques = ques.substring(i+1);
			String roq =  lpartques + rpartques;
			permutations(roq,ch +asf);
			
		}
			
	}
}
