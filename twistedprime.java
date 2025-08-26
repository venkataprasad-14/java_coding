//1).check prime and reverse the number that prime number and again check whether it is prime or not, if it is prime then print as "Twisted prime". 

/* 
2).take a number if it is even then extract 2-2 digits, and print the asci value character
eg-n=12336567
  67-->ch=67-->sopln(ch)--> C and reverse the exracted number and print the asccicode value for that number too 76 -->L 
  45-->ch=65-->sopln(ch)--> A
*/


class twistedprime
{
   public static void main(String [] args)
   {
      int n=13,count=0,rev=0;
     for(int i=1;i<=n;i++)
     {
       if(n%i==0)
	count++;
     }
     if(count==2)
     {
	System.out.println(n+" is prime");
	int n1=n;
	count=0;
	while(n1>0)
	 {
	  rev=(rev*10)+(n1%10);
	  n1/=10;
	 }
	 for(int i=1;i<=n;i++)
    	 {
       		if(n%i==0)
		count++;
    	 }
   	 System.out.println((count==2)?(n+" is twisted prime"):(n+" is not twisted prime"));
     
      }
   }
}



















































































