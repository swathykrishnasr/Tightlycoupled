package onlineshopping;

public class Myntra 
{
	public static void main(String[] args) 
	{
		Dress top=new Dress();
		ornaments ring=new ornaments();
		Footwear foot=new Footwear();
		Order material =new Order();
		material.placeOrder(foot);
	}
}
