package com.website.methodclone.tester;

import com.website.methodclone.base.Product;
import com.website.methodclone.constants.ProductType;
//import com.website.methodclone.base.Language;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product pro = new Product();
		pro.productId = 2345;
		pro.name = "oil";
		pro.price = 165.0;
		pro.type = ProductType.GROCERY;

		pro.displayInfo();
		pro.hashCode();
		System.out.println("Duplicating************");
		
		Language langu= new Language();
		langu.name="Kannada";
		langu.region="Karnataka";
		langu.old=2500;
		
		langu.displayInfo();
		
		try {
			Product pro1=(Product)pro.clone();
			System.out.println(pro1.productId);
			System.out.println(pro1.name);
			System.out.println(pro1.price);
			System.out.println(pro1.type);
			System.out.println("Duplicating************");
			
			Product pro2=(Product)pro.clone();
			System.out.println(pro2.productId);
			System.out.println(pro2.name);
			System.out.println(pro2.price);
			System.out.println(pro2.type);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			
		}

	}

}
