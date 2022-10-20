public class ELatte extends EspressoWithLatte
{
public ELatte(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+50;
}
}