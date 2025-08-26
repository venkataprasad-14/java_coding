//minimun digit in a number

class min
{
  public static void main(String [] args)
  {
    int n=4506,m=n;
    while(n>0)
    {
	int a=n%10;
 	m=Math.min(m,a);
       n=n/10;
    }
     System.out.println(m);
  }
}