public class Pizza {
    
    private int price;
    private int pizzaPrice;
    private int packingCharge=20;
    private int extraToppings=100;
    private int extraCheese=150;
    
    private boolean ispackingCharge=false;
    private boolean isextraToppings=false;
    private boolean isextraCheese=false;
	private boolean veg=false;
	Pizza(boolean veg)
	{
		this.veg=veg;
		if(veg==true)
		{
			 price=300;
		}
		else
			price=400;
		this.pizzaPrice=price;
	}
	public void extraToppings()
	{
		isextraToppings=true;
		pizzaPrice+=extraToppings;
	}
	public void extraCheese()
	{
		isextraCheese=true;
		pizzaPrice+=extraCheese;
	}
	void takeAway()
	{
		ispackingCharge=true;
		pizzaPrice+=packingCharge;
	}
	String getBill()
	{
		String bill="basePizza:"+price+"\n" ;
		if(isextraCheese)
		 bill+=    "extraCheese: "+extraCheese+"\n";

		if(isextraToppings)
			 bill+=  "extraToppings: "+extraToppings+"\n";
		if(ispackingCharge)
			 bill+= "packingCharge: "+ packingCharge+"\n";
		return bill+="total: "+pizzaPrice;
	}
}
