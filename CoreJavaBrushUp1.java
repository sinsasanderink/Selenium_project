
import java.util.Arrays;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a variable and store values: 
		int myNum = 5;
		String website = "Villa Luxo";
		char letter  = 'r';
		float dec = 5.99f; // (float) 5.99 is another way to write it
		double deci = 7.33;
		boolean myCard = true;
		
		System.out.println(dec);
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		
		// Arrays 
		int[] arr = new int[5]; // initialize an array that stores 5 values
		arr[0] = 0; 
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		System.out.println(arr); 
		
		// another way of initilizing an array:
		int[] arr2 = {1,2,4, 5, 6};
		
		// to print the entire array use the following command in combination with import java.util.Arrays;
		System.out.println(Arrays.toString(arr2));
		
		// Looping though an array:
		for(int i = 1; i < arr.length; i++) // i means i + 1, i.e. in every run we will increment i by 1
		{
			System.out.println(arr[i]);
		}	
		
		for (int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		// create string array:
		String[] name = {"Sina", "Jack", "Gina"};
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		// Another way of creating a for loop () (called enhanced for loop):
		for (String s: name)
		{
			System.out.println(s);
		}	

	}

}
