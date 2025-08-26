//chapter2 Question.3

class squaresofdigits
{
  public static void main(String [] args)
  {
    int a=45;
    System.out.println("The squares of digits of the number "+a+" are");
    while(a>0)
    {
      /* int square=a%10;
	System.out.println(square*square); */
	int n=a%10;
	System.out.println((int)Math.pow(n,2));
	a/=10;
    }
  }
}

//Question 4

class palindrome
{
   public static void main(String [] args)
  {
    int n1=45,n2=n1,rev=0;
    while(n2>0)
    {
      rev=(rev*10) +(n2%10);
      n2/=10;
      
    }
    System.out.println((rev==n1)?"Palindrome":"Not a Palindrome");
  }
}