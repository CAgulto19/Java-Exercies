package pack;

public class Rectangle extends Shapes
{
    public double getA() //area
    {
        return geth() * getw();
    }
    public double getB() //perimeter
    {
    	return 2 * (geth() + getw());
    }
}
