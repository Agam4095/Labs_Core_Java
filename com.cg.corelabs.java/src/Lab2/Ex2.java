package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	      int n;   //Declare the array size
	      System.out.println("Enter the number of elements ");
	      n=sc.nextInt();    //Initialize the array size

	      String arr[]=new String[n];   //Declare the array
	      System.out.println("Enter the String ");
	      @SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);    
	      for(int i=0; i<n ;i++)     //Initialize the array
	      {
	          arr[i]=sc1.nextLine();
	      }
	      System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	    System.out.println("Sorted :" + Arrays.toString(arr));
	}
	static void sortStrings(int arr[], int n ){
		
		String[] arr = new String
	}

}
