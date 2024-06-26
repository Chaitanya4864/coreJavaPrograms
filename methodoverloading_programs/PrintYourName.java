// WAP TO PRINT YOUR NAME BY STORING IN CHAR ARRAY
import java.util.*;
class PrintYourName 
{
	public static void main(String[] args) 
	{
		//char rr[] =new char[6];
		//rr[0]='R';
		//rr[1]='A';
		///rr[2]='G';
		//rr[3]='H';
		//rr[4]='A';
		//rr[5]='V';
		Scanner sc=new Scanner(System.in);
		char rr[]=new char[6];

		System.out.print("Enter the characters: ");
		//for(int i=0;i<=5;i++)
			for(int i=0; i<=rr.length; i++)
		{
			rr[i]=sc.next().charAt(0);
		}
		System.out.print("Array elements are: ");
		for(int i=0; i<=5; i++)
		{
			System.out.print(rr[i]);
		}
	}
}
