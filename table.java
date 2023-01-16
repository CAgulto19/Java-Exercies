package pack;

import java.util.*;
public class table {
		  public static void main(String args[])
		   {
		       int row, col, a, b;
		       int arr[][] = new int[10][10];
		       Scanner fire = new Scanner(System.in);
			   
		       System.out.print("Enter Row (within 10) : ");
		       row = fire.nextInt();
		       System.out.print("Enter Column (within 10) : ");
		       col = fire.nextInt();
			   
		       System.out.print("Enter " +(row*col)+ " Array Elements : ");
		       for(a=0; a<row; a++)
		       {
		           for(b=0; b<col; b++)
		           {
		               arr[a][b] = fire.nextInt();
		           }
		       }
			   
		       System.out.print("The Array is :\n");
		       for(a=0; a<row; a++)
		       {
		           for(b=0; b<col; b++)
		           {
		               System.out.print(arr[a][b]+ "  ");
		           }
		           System.out.println();
		       }
		   }
		}