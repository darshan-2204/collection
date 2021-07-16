package com.website.methodclone.tester;
import com.website.methodclone.base.*;

public class LanguageTester {

	public static void main(String[] args) {
		
		Language langu= new Language();
		langu.name="Kannada";
		langu.region="Karnataka";
		langu.old=2500;
		
		langu.displayInfo();
		
		System.out.println("Duplicating************");
		
		try {
			Language langu1=(Language)langu.clone();
			System.out.println(langu1.name);
			System.out.println(langu1.region);
			System.out.println(langu1.old);
			langu1.name="Tamil";
			langu1.region="TamilNadu";
			
			System.out.println("Duplicating************");
			Language langu2=(Language)langu1.clone();
			System.out.println(langu2.name);
			System.out.println(langu2.region);
			System.out.println(langu2.old);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		

	}

}
