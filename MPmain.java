package MP;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MPmain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        while(true) {
        	String bucket = "K", bubble = "B", insertion = "I", ascending = "A", descending = "D";
        	System.out.println("Input 10 Values [0-100]: ");
        
        	for(int i=0;i<10;i++){
        		arr[i]=s.nextInt();
        	}
        	System.out.println("\nChoose Sorting Algorithm [Caps Lock Letters only!!] \n[K] Bucket Sort\n[B] Bubble Sort\n[I] Insertion Sort\nEnter Choice: ");
        	String letter = s.next();
        	if (letter.equals(bucket)) {
        		System.out.println("ALGORITHM SELECTED: Bucket Sort ");
        		bucketSort(arr, 10);
        		System.out.println("SELECT SORTING ORDER: \n[A] Ascending\n[D] Descending \nEnter Choice: "); 
        		String KC = s.next();
        		if (KC.equals(ascending)) {
        			System.out.println("SORTED VALUES: " + Arrays.toString(arr));
        		}
        		else if (KC.equals(descending)) {
        			System.out.println("SORTED VALUES: ");
        			for(int i=arr.length-1;i>=0;i--)
        				System.out.print(arr[i] + "  ");
        		}
        		else {
        			System.out.println("Invalid input.");
        		}
        	}
        	else if (letter.equals(bubble)) {
        		System.out.println("ALGORITHM SELECTED: Bubble Sort.");
        		System.out.println("SELECT SORTING ORDER: \n[A] Ascending\n[D] Descending \nEnter Choice: ");
        		String BC = s.next();
        		if (BC.equals(ascending)) {
        			System.out.println("SORTED VALUES: " + Arrays.toString(basce(arr)) + "\n");
        		}
        		else if(BC.equals(descending)) {
        			System.out.println("SORTED VALUES: " + Arrays.toString(bdesce(arr)) + "\n");
        		}
        		else {
        			System.out.println("Invalid input.");
        		}
        	}
        	else if (letter.equals(insertion)) {
        		System.out.println("ALGORITHM SELECTED: Insertion Sort");
        		System.out.println("SELECT SORTING ORDER: \n[A] Ascending\n[D] Descending \nEnter Choice: "); 
        		String IC = s.next();
        		if (IC.equals(ascending)) {
        			System.out.println("SORTED VALUES: " + Arrays.toString(iAsce(arr)));
        		}
        		else if(IC.equals(ascending)) {
        			System.out.println("SORTED VALUES: " + Arrays.toString(iDesce(arr)));
        		}
        		else {
        			System.out.println("Invalid input.");
        		}
        	}
        	else {
        		System.out.println("Invalid.");
    }
    	System.out.println("\n\nSORT AGAIN [Y/N]?: ");
    	String test = s.next();
    	String no = "N";
    	if (test.equals(no)) {
        	System.out.println("\nGoodbye :) ");
        	s.close();
    		break; }
        }
    }

    private static void bucketSort(int[] intArr, int noOfBuckets){
        @SuppressWarnings("unchecked")
		List<Integer>[] buckets = new List[noOfBuckets];
        for(int i = 0; i < noOfBuckets; i++){
          buckets[i] = new LinkedList<>();
        }
        for(int num : intArr){
          buckets[hash(num)].add(num);
        }
        for(List<Integer> bucket : buckets){
          Collections.sort(bucket);
        }
        int i = 0;
        for(List<Integer> bucket : buckets){
          for(int num : bucket){
            intArr[i++] = num;
          }
        }
               
      }
      private static int hash(int num){
        return num/10;
      }
  	public static int[] basce(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
 
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] bdesce(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
 
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	} 
	 public static int[] iAsce(int arr[]) 
		{  
	        int n = arr.length;  
	        
	        for (int i = 1; i < n; i++)
	        {   
	            int key = arr[i];  
	            int j = i-1;  
	            while ( (j > -1) && ( arr [j] > key ) ) 
	            {  
	                arr [j+1] = arr [j];  
	                j--;  
	            }  
	            arr[j+1] = key;
	            
	        } 
	        return arr;
	    }
	 public static int[] iDesce(int arr[]) 
		{  
	        int n = arr.length;  
	        
	        for (int i = 1; i < n; i++)
	        {   
	            int key = arr[i];  
	            int j = i-1;  
	            while ( (j > -1) && ( arr [j] < key ) )
	            {  
	                arr [j+1] = arr [j];  
	                j--;  
	            }  
	            arr[j+1] = key;

	        } 
	        return arr;
	    }

    }
 