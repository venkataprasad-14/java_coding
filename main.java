class main
{
   public static void main(String [] args)
    {
	int a=4;
	System.out.println("Before while a= "+a);  
	while(true)
	{
	  a=54;
	  System.out.println("inside the while loop a= "+a);
	  break;
	}
	System.out.println("Outside the while loop");
	
    }
}
/*__________________________________________________________________________________________________________________________________________________________*/
class countdigits
{
   public static void main(String [] args)
    {
	int a=445, count=0;
	while(a>0)
	{
	  int b=0;
	  b=a%10;
	  count++;
	  if(b%2==0)
		System.out.println(b +" is even");
	  else
		System.out.println(b +" is odd");

	  a=a/10;
	}
	System.out.println("It is a "+ count +" digit number");
	

    }                                                      
}

/*_____________________________________________________________________________________________________________________________________________________________*/


class year
{
   public static void main(String [] args)
    {
	int year=2020;
	if(year%4==0 && year%100!=0 || year%400==0)
		System.out.println("Leap year");
	else 
		System.out.println("Not a Leap year");
    }                                                      
}

/*_____________________________________________________________________________________________________________________________________________________________*/

 class ternary
{
  public static void main(String [] args)
  {
     
    

  }
}

