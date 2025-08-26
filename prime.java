class prime
{
   public static void main(String [] args)
   {
     int n=7,count=0;
     for(int i=1;i<=n; i++)
     {
	if(n%i==0)
	{
	   count++;	
	}
     }
  System.out.println((count==2)?(n+" is prime"):(n+ " is not prime"));
   }
}


class factor
{
   public static void main(String [] args)
   {
     int n=500,count=0;
     for(int i=1;i<=n; i++)
     {
	if(n%i==0)
	{
	   count++;	
	}
     }
   System.out.println(count);
  System.out.println((count==10)?(n+" is special"):(n+ " is not special"));
   }
}










/*class x
{
   public static void main(String [] args)
   {
    int a;
    string="";
    System.out.println();
   }
} */