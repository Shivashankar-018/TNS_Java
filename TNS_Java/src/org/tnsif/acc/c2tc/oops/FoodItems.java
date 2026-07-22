package org.tnsif.acc.c2tc.oops;

public class FoodItems {

	//variable
	String name;
	double price;
	String category;
	
	//method
	void displayDetail()
	{
		System.out.println("Food name :"+ name);
		System.out.println("Price :"+ price);
		System.out.println("Category :"+category);
		System.out.println("----");
	}
	

	public static void main(String[] args) {
		FoodItems fooditem1=new FoodItems();
		fooditem1.name="Briyanni";
		fooditem1.price=299.99;
		fooditem1.category="Rice";
		
		FoodItems fooditem2=new FoodItems();
		fooditem2.name="Pizaa";
		fooditem2.price=399.99;
		fooditem2.category="Fast Food";
		
		fooditem1.displayDetail();
		fooditem2.displayDetail();

	}



	}


