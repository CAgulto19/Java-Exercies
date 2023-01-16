package pack;

public class prism extends mainn{
	double base;
	double height;
	prism(double base, double height)
	{
		this.base = base;
		this.height = height;
		}
	double getVolume()
	{
		return base * height;
		}

}

