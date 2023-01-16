
package test;
import java.util.Scanner;

class msqr {
@SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Give an odd number: ");
    int n = input.nextInt();
    if (n%2!=0) {
    	int[][] msquare = new int[n][n];
    	int number = 1;
    	int row = 0;
    	int column = n / 2;
    	int prerow;
    	int precol;
    
    	while (number <= n * n) {    		
    		msquare[row][column] = number;
    		number++;
    		prerow = row; precol = column;
        	row -= 1;
        	column += 1;
        	if (row == -1) {
        		row = n - 1;
        	}
        	if (column == n) {
        		column = 0;
        	}
        	if (msquare[row][column] != 0) {
        		row = prerow + 1;
        		column = precol;
        		
        	if (row == -1) {
        		row = n - 1;
        		}
        	}
    	}

    	for (int i = 0; i < msquare.length; i++) {
    		for (int j = 0; j < msquare.length; j++) {
    			System.out.print(msquare[i][j] + " ");
    		}
    		System.out.println();
    	}

}
    else {
    	System.out.println("Wrong Input.");
    	
    }
}
}
