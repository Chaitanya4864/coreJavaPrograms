class Addition 
{
	public static void sum(int a, int b)
	{
		System.out.println( " sum of "+a+" & "+b+" is "+(a+b));
	}
	public static void sum(int a, int b,int c)
	{
		System.out.println(" sum of "+a+" & "+b+" & "+c+" is "+(a+b+c));
	}
	public static void sum(int a,double b)
	{
	System.out.println( "sum of "+a+" & "+b+" is "+(a+b));
	}
	public static void sum(double a, double b)
	{
		System.out.println( "sum of "+a+" & "+b+" is "+(a+b));
	}
	public static void main(String[] args) 
	{
		sum(8.5,9.5);
		sum(8,8);
		sum(1,2,3);
		sum(3,2.0);
	}
}
