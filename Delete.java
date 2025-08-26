//deleting an element from the array 
import java.util.Scanner;
class Delete
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60,40,80,90,100};
		System.out.println("Enter which indexed element you want to delete ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();

		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
		for(int temp:a)
			System.out.print(temp+"  ");
	}
}

//________________________________________________________
 
class Delete1
{
	public static void main(String [] args)
	{
		int a[]=new int[]{20,20,30,10,20,20,20,20,20,20,80,20,90,20,100};
		System.out.println("The given array is ");
		for(int temp:a)
				System.out.print(temp+"  ");
		System.out.println();
		System.out.println("Enter which element you want to delete ");
		Scanner sc=new Scanner(System.in);
		int delete=sc.nextInt();
		for(int k=0;k<a.length;k++)
		{
			for(int j=0;j<a.length;j++)
			{
				int index=0;
				if(a[j]==delete)
				{
					index=j;
			
					for(int i=index;i<a.length-1;i++)
					{
						a[i]=a[i+1];
					}
					a[a.length-1]=0;
				}
			
			}
		}
			for(int temp:a)
				System.out.print(temp+"  ");
	}
}

//====================================================

class insert
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,20,30,40};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to insert");
		int insert=sc.nextInt();
		System.out.println("Enter at what index you want to insert");
		int index=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				for(int j=a.length-2;j>=index;j--)
				{
					a[j+1]=a[j];
				}
				a[index]=insert;
			}
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}