package com.website.methodclone.tester;

import com.website.methodclone.base.Application;

public class ApplicationTester {

	public static void main(String[] args) {
		Application app = new Application();
		app.name = "Instagram";
		app.developer = "dev";
		app.version = 17.8;

		app.displayInfo();
		// app.hashCode();
		System.out.println("Duplicating************");

		try {
			Application app1 = (Application) app.clone();
			System.out.println(app1.name);
			System.out.println(app1.developer);
			System.out.println(app1.version);
			System.out.println("Duplicating************");
			Application app2 = (Application) app.clone();
			System.out.println(app2.name);
			System.out.println(app2.developer);
			System.out.println(app2.version);
			app1.name = "Zoom";
			app1.developer = "Kiran";
			System.out.println("Duplicating************");
			Application app3 = (Application) app1.clone();
			System.out.println(app3.name);
			System.out.println(app3.developer);
			System.out.println(app3.version);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
