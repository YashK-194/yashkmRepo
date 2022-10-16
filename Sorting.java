package exceptionHandlingDemo;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		  
		int [] array = new int [] {10, 9, 67, 21, 13, 43, 9, 22, 47, 0, 22, 99};  
    
    	System.out.println("Here's the unsorted array ");
    
    for (int j = 0; j < array.length; j++)   // using array.lenght for dynamic array lenght
		{       
		System.out.println(array[j]);   
		}   
		//Using sort() method   
		Arrays.sort(array);   
		
		System.out.println("Here's the sorted array ");  
		 // Now printing the Sorted array 
    
		for (int i = 0; i < array.length; i++)  
		{       
		System.out.println(array[i]);   
		}   
		
}
}
