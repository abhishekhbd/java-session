package com.java.session.example.day1;

public class CharacterCount {

	public static void main(String[] args) {
		
		String sampleString = "ABCDAEFGH";
		int count = (int) sampleString.chars().filter(ch -> ch == 'A').count();
		System.out.println(count);
	}
	
	private static CharacterCount instance = null;
	private CharacterCount(){}
	public CharacterCount getInstance(){
		synchronized (this) {
			if(null == instance){
				return instance = new CharacterCount();
			}
			return instance;
		}
	}

}
