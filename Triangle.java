package pack;

public class Triangle extends Shapes
{ 
    public double getA() //area
    {
        return (geth() * getw()) / 2;
    }
    public double getB() //perimeter
    {
        return geth() + getw() + Math.pow(Math.pow(geth(), 2) + Math.pow(getw(), 2),0.5);
        
    }
}       