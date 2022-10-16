package exceptionHandlingDemo;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int [] array = new int [] {10, 9, 67, 21, 13, 43, 22};  
		//Using sort() method   
		Arrays.sort(array);   
		
		System.out.println("Here's the sorted array ");  
		 
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
		
}
}
