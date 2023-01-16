package pack;

public class rect extends mainn{
	double length;
	double width;
	rect(double length, double width)
	{
		this.length = length;
		this.width = width;
		}
	double getArea()
	{
		return length * width;
		}
	double getPerimeter()
	{
		return 2 * (length + width);
		}
}
