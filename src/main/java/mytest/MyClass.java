package mytest;

public class MyClass {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int diff(int a, int b)
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
	
	public void show()
	{
		System.out.println("Hello GFG");
		System.out.println("Hello DevOps");
	}

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		System.out.println("Sum is "+ob.sum(20, 10));
		System.out.println("Diff is "+ob.diff(20, 10));
		System.out.println("Mul is "+ob.mul(20, 10));
		System.out.println("Div is "+ob.div(20, 10));
		ob.show();

	}

}
