package pack;
import java.util.Scanner;
public class mainn {
	public void vari() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Choose between: [1] - Rectangle, [2] - Prism, [other numbers] - invalid): ");
	    int choice = input.nextInt();
	    if (choice == 1 ){
		    System.out.print("Enter length and width: ");
		    int length = input.nextInt(), width = input.nextInt();
			rect rect = new rect(length, width);
			System.out.println("Area is: " + rect.getArea());
			System.out.println("Perimeter is: " + rect.getPerimeter());
			}
	    
	    else if (choice == 2 ){
	    	System.out.println("You chose Prism. Enter area of base and height: ");
		    int base = input.nextInt(), height = input.nextInt();
			prism rect = new prism(base, height);
			System.out.println("Volume of Prism is: " + rect.getVolume());
			}
	    else {
	    	System.out.println("Invalid~");
	    	
	    //no thoughts head empty
	    }	
	    }
	}
