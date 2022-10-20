public class CCream extends CappuccinoWithCream
{
public CCream(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+30;
}
}