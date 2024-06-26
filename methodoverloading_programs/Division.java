class Division 
{
public static int d1(int a, int b)
	{
	int c=a/b;
	return c;
	}
	public void d1(double a, double b)
	{
		double c=a/b;
		System.out.println(" division of "+a+" & "+b+" is "+c); 
	}
	public static void main(String[] args) 
	{
		System.out.println(d1(15,5));
		Division di= new Division();
		di.d1(6.0,2.0);
	}
}
