package hotel;

public class Resturant
{
	public static void main(String[] args) 
	{
		Waiter midhun=new Waiter();
		
		Veg meals=new Veg();
		Veg sadhya=new Veg();
		Nonveg briyani=new Nonveg();
		midhun.takeOrder(sadhya);
		
	}
}
