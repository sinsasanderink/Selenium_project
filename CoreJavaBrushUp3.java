
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In java, string is an object that represents a sequence of characters
		// ways of creating a string: 
		String s = "sina";
		String s1 = "sina"; // in case of duplicates, s1 will point to s and get value from s
		String s5 = "hello"; // new string will be stored because "hello" not present
		
		// another way of creating strings
		String s2 = new String("Welcome");
		String s3 = new String("Welcome"); // this one will create a new String and stores Welcome once again (so less efficient)
		
		// convert string into array of strings
		String s6 = "Sina Sanderink Selenium";
		String[] splittedString = s6.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		System.out.println("************");
		
		String[] splittedString1 = s6.split("Sanderink");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		// to remove white spaces: 
		System.out.println(splittedString1[1].trim());
		
		// print all characters in s6 String:
		for (int i = 0; i < s6.length(); i++)
		{
			System.out.println(s6.charAt(i));// this will return character at index in strings
		}
		
		// print string in reverse: 
		for (int i = s6.length()-1; i>= 0; i--)
		{
			System.out.println(s6.charAt(i));// this will return character at index in strings
		}

	}

}
