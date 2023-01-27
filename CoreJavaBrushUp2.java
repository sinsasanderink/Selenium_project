import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static array: (fixed size)
		int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
		
		for(int i = 0; i<arr2.length; i++)
		{   // only print values that can be divided by 2:
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
			
		}
		
		// check in the array has any value that is a multiple of 2 (returns the first num that is dividable by 2
		for(int i = 0; i<arr2.length; i++)
		{   // only print values that can be divided by 2:
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
		}
		
		// Dynamic array list: does not require initialization of a specific length like the previous arrays:
		ArrayList<String> a = new ArrayList<String>(); // import ArrayList
		// create object of the class - object.method, to access methods write a. and a list of methods will be suggested
		a.add("selenium");
		a.add("JAVA");
		a.add("Python");
		a.add("Kotlin");
		a.add("WebDriver");
		a.add("DevOps");
		a.remove(2); // this will remove the string at index 2
		System.out.println(a.get(4)); // This will print the value at index 4
		
		// write for loop that prints all values in Dynamic array: 
		for(int i = 0; i<a.size();i++) // on ArrayList, you need to use .size() to get the length
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("************");
		
		// Enhanced for loop: 
		for (String val :a)
		{
			System.out.println(val);
		}
		
		// Find out if an item is present in an ArrayList:
		System.out.println(a.contains("selenium"));
		
		// Convert arrays to ArrayList to get access to all the methods (such as contains):
		String[] name = {"Sina", "Sanderink", "Jack"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));
	}

}
