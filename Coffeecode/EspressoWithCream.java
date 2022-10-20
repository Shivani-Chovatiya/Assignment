public class EspressoWithCream implements Coffee
{
	protected Coffee c;

public EspressoWithCream(Coffee c)
{
this.c=c;
}
@Override
public int cost(){
return c.cost();
}
}