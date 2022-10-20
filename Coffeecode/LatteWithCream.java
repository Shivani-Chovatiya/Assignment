public class LatteWithCream implements Coffee
{
	protected Coffee c;

public LatteWithCream(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}