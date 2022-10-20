public class LatteWithLatte implements Coffee
{
	protected Coffee c;

public LatteWithLatte(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}