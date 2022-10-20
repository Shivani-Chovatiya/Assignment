public class EMilk extends EspressoWithMilk
{
public EMilk(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+10;
}
}