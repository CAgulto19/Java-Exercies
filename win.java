package finished;
import java.util.*;
public class win {
	
	public static void main(String[] args) {
	
		String word, b2b = "";
	    Scanner fire = new Scanner(System.in);
        boolean bad = true;
	    boolean cont = true;
	    while (cont) {
	    System.out.println("Please input string");
	    word = fire.nextLine();

	    int length = word.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	    b2b = b2b + word.charAt(i);

	    System.out.println("Reverse of the string: " + b2b );
	    
	        while (bad) {
	          System.out.println("Continue? (Y/N): ");
	          String choice = fire.nextLine();
	          
	          if ("y".equalsIgnoreCase(choice)) {
	              bad = false;
	          }
	          else if ("n".equalsIgnoreCase(choice)) {
	        	  System.out.println("Thanks for visiting uwu");
	              bad = false;
	              cont = false;
	          }
	          else {
	              System.err.print("Error: I'll only accept Y or N >:( !");
	          }
	        }
	    }

		}
	    
	}

