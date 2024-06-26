// WAP TO PRINT 7 STUDENTS PERCENTAGE BY STORING IN DOUBLE ARRAY
import java.util.*;
class Student 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		double s1[]=new double[5];
		System.out.println("Enter Student percentages: ");
		for(int i=0; i<s1.length;i++)
		{
			s1[i]=sc.nextDouble();
		}
		for(int i=0; i<=4;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
