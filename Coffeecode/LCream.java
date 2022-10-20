public class LCream extends LatteWithCream
{
public LCream(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+55;
}
}