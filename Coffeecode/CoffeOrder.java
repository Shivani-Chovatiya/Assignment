import java.util.*;

public class CoffeOrder {
	
	public static void display(){
		System.out.println("Price of Espresso with Milk :"+new EMilk(new Espresso()).cost());
		System.out.println("Price of Cappuccino with Milk :"+new CMilk(new Cappuccino()).cost());
		System.out.println("Price of Latte with Milk :"+new LMilk(new Latte()).cost());
		System.out.println("Price of Espresso with Cream :"+new ECream(new Espresso()).cost());
		System.out.println("Price of Cappuccino with Cream :"+new CCream(new Cappuccino()).cost());
		System.out.println("Price of Latte with Cream :"+new LCream(new Latte()).cost());
		System.out.println("Price of Espresso with Latte :"+new ELatte(new Espresso()).cost());
		System.out.println("Price of Cappuccino with Latte :"+new CLatte(new Cappuccino()).cost());
		System.out.println("Price of Latte with Latte :"+new LLatte(new Latte()).cost());
		
	}
	public static void display2(int total){
		Scanner sc  = new Scanner(System.in);
				String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.equals("Espresso"))
		{
			if(s2.equals("Milk"))
			{
				
				System.out.println("Price of "+s1+" with "+s2+" :"+new EMilk(new Espresso()).cost());
				total+=new EMilk(new Espresso()).cost();
			}
			else if(s2.equals("Cream"))
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new ECream(new Espresso()).cost());
				total+=new ECream(new Espresso()).cost();
			}
			else
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new ELatte(new Espresso()).cost());	
				total+=new ELatte(new Espresso()).cost();
			}
		}
		else if(s1.equals("Cappuccino"))
		{
			if(s2.equals("Milk"))
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new CMilk(new Cappuccino()).cost());
				total+=new CMilk(new Cappuccino()).cost();
			}
			else if(s2.equals("Cream"))
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new CCream(new Cappuccino()).cost());
				total+=new CCream(new Cappuccino()).cost();
			}
			else
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new CLatte(new Cappuccino()).cost());
				total+=new CLatte(new Cappuccino()).cost();
			}
		}
		else
		{
			if(s2.equals("Milk"))
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new LMilk(new Latte()).cost());
				total+=new LMilk(new Latte()).cost();
			}
			else if(s2.equals("Cream"))
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new LCream(new Latte()).cost());
				total+=new LCream(new Latte()).cost();
			}
			else
			{
				System.out.println("Price of "+s1+" with "+s2+" :"+new LLatte(new Latte()).cost());
				total+=new LLatte(new Latte()).cost();
			}
		}
	System.out.println("Total Price is: "+total);
	
	System.out.println("Do you add more coffee cup ??");
		String s=sc.nextLine();
		if(s.equals("yes"))
		{
			display2(total);
			
		}
			
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Display all Order: ");
		display();
		System.out.println("Enter Coffee Type also add-on item: ");
		Scanner sc  = new Scanner(System.in);
		int total=0;
		display2(total);
		

		
	}
	
	

}