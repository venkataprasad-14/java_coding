class Compare2Arrays
{
	public static void main(String [] args )
	{
		int a[] =new int [] {10,20,30,40};
		int b[] =new int [] {10,20,30,40,0};
		boolean check=false;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					check=true;
				else 
				{
					check=false;
					break;
				}
			}
			if(check)
					System.out.println("Both Arrays have same length and same elements");
				else
					System.out.println("Both arrays have same length but different elements");
		}
		else
			System.out.println("The given arrays have different lengths so it is not posiible to compare");
	}
}

//_______________________________________________________________


class Anagram
{
	public static void main(String [] args )
	{
		int a[] =new int [] {10,20,30,0};
		int b[] =new int [] {30,20,40,10};
		boolean present=false;
		if (a.length==b.length)
		{
			for(int i=0;i<a.length;i++)//0<4 //1<4
			{
				present=false;//f
				for(int j=0;j<b.length;j++)//0<4 //1<4 //2<4 //3<4
				{
					if(a[i]==b[j])//a[0]==b[0]10==30(f) //10==20(f) //10==40(f) //10==10 
					
					{
						present=true;//t
						break;
					}
				}
			}
			if(present)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
	}
}	
