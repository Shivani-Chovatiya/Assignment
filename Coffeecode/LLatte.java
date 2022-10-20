public class LLatte extends LatteWithLatte
{
public LLatte(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+80;
}
}