public class EspressoWithLatte implements Coffee
{
	protected Coffee c;

public EspressoWithLatte(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}