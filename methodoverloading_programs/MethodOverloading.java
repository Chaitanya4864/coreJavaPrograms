class MethodOverloading 
{
	public void test(char a)
	{
		System.out.println("test method with single character");
	}
	public void test(boolean a, boolean b)
	{
		System.out.println("test method with boolean, boolean arguments");
	}
	public void test (int a, int b, String z)
	{
		System.out.println("test method with int,int,string arguments");
	}
	public static void main(String[] args) 
	{
		MethodOverloading mn=new MethodOverloading();
		mn.test('s');
		mn.test(true,false);
		mn.test(1,2,"Chaithu");
	//	System.out.println(test(true,false));
	//	System.out.println(test(5,5,"chaithu"));

	}
}
