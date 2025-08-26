import java.util.Scanner;
class FL_Ocuurance
{
	public static void main(String [] args)
	{                   //0  1  2  3   4   5   6   7  8  9
		int a[]=new int[]{10,20,10,30,201,150,415,12,12,150};
		System.out.println("Enter the element you want to search");
		Scanner sc=new Scanner(System.in);
		int search =sc.nextInt();
		int first=-1,last=-1;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				first=i;
				break;
			}
		}
		
		for (int i=a.length-1;i>=0;i--)
		{
			if(a[i]==search)
			{
				last=i;
				break;
			}
		}
		if(last!=-1)
		{
			System.out.println("The first occurance of "+search +" is at index "+first);
			System.out.println("The last occurance of "+search +" is at index "+last);
		}
		else
			System.out.println("Element not found");
	}
}