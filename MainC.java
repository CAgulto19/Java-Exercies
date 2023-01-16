package pack;
import java.util.Scanner;
public class MainC
{
    public static void main(String[] args)
    {
        Shapes shape;
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Choose between: [1] - Rectangle, [2] - Triangle, [other numbers] - invalid): ");
	    int choice = input.nextInt();
	    
	    if (choice == 1 ){
			Rectangle rect = new Rectangle();
		    System.out.print("You chose Rectangle. Enter length and width: ");
		    int var1 = input.nextInt(), var2 = input.nextInt();
		    shape = rect;
		    shape.setv(var1, var2);
	        System.out.println("Area of rectangle is: " + shape.getA());
	        System.out.println("Perimeter of rectangle is: " + shape.getB());
	    }
	    
	    else if (choice == 2 ){
	        Triangle tri = new Triangle();
		    System.out.print("You chose Triangle. Enter length and width: ");
		    int var1 = input.nextInt(), var2 = input.nextInt();
	        shape = tri;
		    shape.setv(var1, var2);
	        System.out.println("Area of triangle is: " + shape.getA());
	        System.out.println("Perimeter of triangle is: " + shape.getB());
	    }
	    
	    else {
	    	System.out.println("Invalid. Try again.");
	    	}
	}
}