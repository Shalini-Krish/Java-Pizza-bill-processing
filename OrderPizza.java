public class OrderPizza {

	public static void main(String[] args) {
		  Pizza p = new Pizza(false); //veg// 300	
    p.extraCheese();//100
		      p.extraToppings();//50
		    p.takeAway(); //20
		 System.out.println(p.getBill());
	 System.out.println("_________________________________"); 
		 
		  Deluxe d = new Deluxe(true);
		 d.extraCheese();
	      d.extraToppings();
		  System.out.println(d.getBill());

	}

}
