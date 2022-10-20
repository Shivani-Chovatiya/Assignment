public class LMilk extends LatteWithMilk
{
public LMilk(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+30;
}
}