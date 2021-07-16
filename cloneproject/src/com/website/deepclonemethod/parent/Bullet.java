package com.website.deepclonemethod.parent;
import com.website.deepclonemethod.constants.BulletType;

public class Bullet {
	
	public int size;
	public String material;
	public BulletType type;
	
	public Bullet(int size,String material,BulletType type) {
		this.size=size;
		this.material=material;
		this.type= type;
		}
		
		@Override
		public Bullet clone() throws CloneNotSupportedException {
			System.out.println("invoking clone method");
			return (Bullet) super.clone();
		
	}
  
		public void displayInfo() {
		
		}
}
