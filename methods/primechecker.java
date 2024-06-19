class primechecker 
{
	public static void main(String[] args) 
	{
		System.out.println(num(2));
	}
	public static boolean num(int numb)
	{
		int count=0;
		for(int i=1; i<=numb; i++)
		{
			if(numb%i==0)
			{
				count++;

			}
		}
		return count==2;
		
	}
}
