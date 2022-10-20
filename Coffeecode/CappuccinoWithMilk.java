public class CappuccinoWithMilk implements Coffee
{
	protected Coffee c;

public CappuccinoWithMilk(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}