package com.tp.composite;

public class Main {

	public static void main(String[] args) {
		
		
		Component c1 = new Product(4);
		Component c2 = new Category(5);
		Component c3 = new Category(2);
		Component c4 = new Category(1);
		
		((Category) c2).deleteComponent(c2,1);
		((Category) c4).deleteComponent(c4,4);
		
		

		
		 

	}

}
