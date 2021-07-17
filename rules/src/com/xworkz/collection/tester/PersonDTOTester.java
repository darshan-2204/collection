package com.xworkz.collection.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.collection.constraints.PersonDTO;

public class PersonDTOTester {

	public static void main(String[] args) {
		PersonDTO person=new PersonDTO("Darshan", 23, "darshanhp2204@gmail.com", "Mandya");
		PersonDTO person1=new PersonDTO("Sachin", 24, "sachin04@gmail.com", "Davanagere");
		PersonDTO person2=new PersonDTO("Aish", 21, "aish4@gmail.com", "Hassan");
		PersonDTO person3=new PersonDTO("Sunil", 26, "Sunil@gmail.com", "Bangalore");
		PersonDTO person4=new PersonDTO("Vaishnavi", 22, "vaishnavi2204@gmail.com", "Raichur");
		
		List<PersonDTO> list =new ArrayList<PersonDTO>();
		list.add(person4);
		list.add(person3);
		list.add(person1);
		
		System.out.println(list.size());
		
		List<PersonDTO> list1 =new ArrayList<PersonDTO>();
		list1.add(person2);
		list1.add(person);
		
		System.out.println(list1.size());
       
		list1.addAll(list);
		System.out.println(list1);
		System.out.println(list1.size());
		 
		boolean containsAll =list1.containsAll(list);
		System.out.println("containsAll"+containsAll);
	
		Collections.sort(list1);
		Iterator<PersonDTO> itr= list1.iterator();
	    
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			}
						
	}

} 
