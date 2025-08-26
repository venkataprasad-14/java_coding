import java.util.Scanner;
class SearchElementCount
{
	public static void main(String [] args)
	{
		int []a=new int[]{40,30,50,30,60,70,40,30};
		int search=40,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
				count++;
		}
		System.out.println(search+" is found "+count+" in the array" );
	}
}
//______________________________________________________________


class SearchElementCountWM
{
	public static void main(String [] args)
	{
		int []a=new int[]{40,30,50,30,60,70,40,30};
		System.out.println("Enter the element u want to search");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		SearchElementCountWM obj=new SearchElementCountWM();
		obj.searching(a,search);
	}
	void searching(int [] a,int search)
	{
		
			int count=0;
		for(int i=0;i<a.length;i++)
		{  
		
			if(a[i]==search)
				count++;
		}
		if(count>1)
			System.out.println(search+" is found "+count+" in the array" );
		else
			System.out.println(search+" is not found in the array");
	}
}
