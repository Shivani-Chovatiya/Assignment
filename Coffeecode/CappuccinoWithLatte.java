public class CappuccinoWithLatte implements Coffee
{
	protected Coffee c;

public CappuccinoWithLatte(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}