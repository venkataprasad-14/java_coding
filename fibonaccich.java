// i want to print first 10 numbers of the Fibonacci series.


class fibonacci
{
  public static void main(String args[])
  {
    int n1=0,n2=1,n3=0;
    for(int i=1;i<10;i++)    
    {
	n3=n1+n2;
	n1=n2;
	n2=n3;
    }
    System.out.println(n1);
  }
}