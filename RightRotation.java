import java.util.Scanner;
class RR
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40};
		System.out.println("Enter n.o of rotations you want");
		Scanner sc=new Scanner(System.in);
		int rotations=sc.nextInt();
		RR obj=new RR();
		int [] result=obj.rr(a,rotations);
		for(int temp:result)
			System.out.print(temp+"  ");
	}
	 int [] rr(int [] a,int rotations)
	{
		for(int i=0;i<rotations;i++)
		{
			int copy=a[a.length-1];
			for(int j=a.length-2;j>=0;j--)
			{
				a[j+1]=a[j];
			}
			a[0]=copy;
		}
		return a;
	}
}