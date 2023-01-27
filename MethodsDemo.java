
public class MethodsDemo {

	public static void main(String[] args) { // if you want to access this class from other classes use public, private will mean you wont be able to access it from other classes
		// TODO Auto-generated method stub
		
		// to access getData method (i.e. class method), you must first create an instance of the class:
		MethodsDemo d = new MethodsDemo();
		String name = d.getData(); // if theres no static keyword, you need to create an instance to access getData method
		System.out.println(name);
		
		// get getUserData() method from MethodsDemo2.java class
		// 1) create object of MethodsDemo2 class in MethodsDemo.java
		MethodsDemo2 d1 = new MethodsDemo2(); // must be a public class to access it
		d1.getUserData();
		
		// access class methods (eg getData() without creating objects:
		// to do this, mark your method as static
		getData2();
		

	}
	// METHODS:
	// methods must be initialized outside the main block, i.e. here after the bracket
	// use methods if you want to reuse a functionality 
	
	public String getData() // if no return use void - means its not returning anything
	{
		System.out.println("hello world");
		return "sina sandrink";
	}
	
	public static String getData2() // if no return use void - means its not returning anything
	{
		System.out.println("hello world2");
		return "sina sandrink2";
	}

}
