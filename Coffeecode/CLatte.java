public class CLatte extends CappuccinoWithLatte
{
public CLatte(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+65;
}
}