public class EspressoWithMilk implements Coffee
{
	protected Coffee c;

public EspressoWithMilk(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
	
}