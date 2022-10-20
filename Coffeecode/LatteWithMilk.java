public class LatteWithMilk implements Coffee
{
	protected Coffee c;

public LatteWithMilk(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}