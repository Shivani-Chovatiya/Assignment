public class CappuccinoWithCream implements Coffee
{
	protected Coffee c;

public CappuccinoWithCream(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}