  import java.util.Scanner;
  class PrintArrayElements
  {
	public static void main(String [] args)
	{
		int count1=0,count2=0,count3=0,count4=0;
		int [] a=new int[]{139,12,34,5,566,7};
		String [] s= new String[] {"hello","all","good","Morning","453","?<>|+_"};
		boolean [] b= new boolean[]{true,false,true,false,true,true};
		for(int i=0;i<a.length;i++)
		{	
			count1++;
			System.out.print(a[i]+ "\t");
		}
		System.out.println("The length of the int array is "+a.length+" count1 is "+count1);
		
		for(int i=0;i<s.length;i++)
		{
			count2++;
			System.out.print(s[i]+ "\t");
		}
		System.out.println("The length of the string array is "+s.length+" count2 is "+count2);
		
		for(int i=0;i<b.length;i++)
		{
			count3++;
			System.out.print(b[i]+ "\t");
		}
		System.out.println("The length of boolean array is "+b.length+" count3 is "+count3);
	
		System.out.println("Enter 4 character elements");
		Scanner obj=new Scanner(System.in);
		char [] c =new char[4];
		for(int i=0;i<c.length;i++)
			c[i]=obj.next().charAt(0);
		for(int i=0;i<c.length;i++)
		{
			count4++;
			System.out.print(c[i]+ "\t");
		}
		System.out.println("The length of the character array is "+c.length +" count4 is "+count4);
	}
  }