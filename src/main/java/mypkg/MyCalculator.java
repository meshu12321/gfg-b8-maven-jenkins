package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public void display()
	{
		System.out.println("Welcome GFG");
	}
	public void display2()
	{
		System.out.println("Welcome GFG");
	}
	public void display3()
	{
		System.out.println("Welcome GFG3");
	}

	public static void main(String[] args) {
		
		MyCalculator ob = new MyCalculator();
		System.out.println("Sum is: "+ob.sum(20, 10));
		System.out.println("Sum is: "+ob.sub(20, 10));
	}
}
