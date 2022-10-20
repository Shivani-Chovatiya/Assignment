public class ECream extends EspressoWithCream
{
public ECream(Coffee c)
{
super(c);
}
@Override
public int cost(){
return c.cost()+25;
}
}