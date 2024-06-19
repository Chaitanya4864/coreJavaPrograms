
class formula

{
	public static void main(String[] args) 
	{
		if(LHS(2,3)==rhs(2,3))
		{
			System.out.println("Hence it is proved");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static int lhs(int a,int b)
	{
		int res =(a*a)-(b*b);
		return res;
	}
public static int rhs(int a, int b)
	{
	int res1 =(a-b)*(a+b);
	return res1;
	}
}
