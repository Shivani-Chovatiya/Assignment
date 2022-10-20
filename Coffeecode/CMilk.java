public class CMilk extends CappuccinoWithMilk
{
public CMilk(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+20;
}
}