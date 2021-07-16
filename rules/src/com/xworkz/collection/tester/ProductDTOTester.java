package com.xworkz.collection.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.constraints.PersonDTO;
import com.xworkz.collection.constraints.ProductDTO;

public class ProductDTOTester {

	public static void main(String[] args) {
		
		ProductDTO pro =new ProductDTO("Shrit", "Nike", 1000d, true);
		ProductDTO pro1 =new ProductDTO("Shoe", "Puma", 3000d, true);
		ProductDTO pro2 =new ProductDTO("Bag", "Widkraft", 1500d, true);
		ProductDTO pro3 =new ProductDTO("Whatch", "FastTrack", 4000d, true);
		ProductDTO pro4 =new ProductDTO("Perfume", "Magnet", 500d, true);
		
		List<ProductDTO> list=new ArrayList<ProductDTO>();
		list.add(pro);
		list.add(pro2);
		list.add(pro4);
		list.add(pro1);
		list.add(pro3);
		
		System.out.println("Size:"+list.size());
		
		System.out.println(list.toString());
		
		Collections.sort(list);
		Iterator<ProductDTO> itr= list.iterator();
	    
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			}
		
		

	}

}
