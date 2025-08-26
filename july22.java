//print sum of digits in a number
class SumOfDigits
{
  public static void main(String [] args)
  {
    int num=2529,b=0;
    while(num>0)//ture//false
    {
	b=b+num%10; //0+9=9 //9+2=11 //11+5=16 //16+2=18
	num=num/10; //252 //25 //2 //0 
    }
   System.out.println("The sum of digits is "+b); //18
   System.out.println(num); //0
  }
}

/*_______________________________________________________________________________*/

//print multiplication of digits in a number
class MulOfDigits
{
  public static void main(String [] args)
  {
    int num=2529,b=1;
    while(num>0)  
  {
	b=b*(num%10); 
	num=num/10;    
  }
   System.out.println("The multification of digits is "+b); 
   }
}

/*_______________________________________________________________________________*/

class NoOfDigits
{
  public static void main(String [] args)
  {
    int num=2529,b=0;
    while(num>0)  
  {
	int c=num%10;
  	b++; 
	num=num/10;    
  }
   System.out.println("No of digits is "+ b); 
   }
}

/*_______________________________________________________________________________*/

class evenprint
{
  public static void main(String [] args)
  {
    int num=2569;
    System.out.println("The even numbers in the digit are "); 
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2==0)
		System.out.println(c); 
	num=num/10;    
     }
   }

}

/*_______________________________________________________________________________*/

class evensum
{
  public static void main(String [] args)
  {
    int num=2569,b=0;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2==0)
		b=b+c; 
	num=num/10;    
     }
    System.out.println("The sum of even numbers in the digit are "+b);
   }

}

/*_______________________________________________________________________________*/

class oddprint
{
  public static void main(String [] args)
  {
    int num=2569;
    System.out.println("The odd numbers in the digit are "); 
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2!=0)
	System.out.println(c);
	num=num/10;    
     }
    
   }
}

/*_______________________________________________________________________________*/

class oddsum
{
  public static void main(String [] args)
  {
    int num=2569,b=0;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2!=0)
		b=b+c; 
	num=num/10;    
     }
    System.out.println("The sum of odd numbers in the digit are "+b); 
   }
}

/*_______________________________________________________________________________*/

class evencount
{
  public static void main(String [] args)
  {
    int num=2569,count=0;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2==0)
		count++; 
	num=num/10;    
     }
 System.out.println("The total number of even numbers in the digit are " + count); 
   }
}


/*_______________________________________________________________________________*/

class evenodd
{
  public static void main(String [] args)
  {
    int num=25619,count1=0,count2=0;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2!=0)
	  {
		System.out.println(c+" is odd");
		count1++;
	  }
	 else
	  {
		count2++;
		System.out.println(c+" is even");

	  } 
	num=num/10;    
     }
 System.out.println("The total number of even numbers in the digit are " + count2); 
 System.out.println("The total number of odd numbers in the digit are " + count1); 
   }
}

/*_______________________________________________________________________________*/

class extract2digits
{
  public static void main(String [] args)
  {
    int num=25619;
    while(num>0)  
     {
	System.out.println(num%100);
	num=num/100;    
     }
  
   }
}

/*_______________________________________________________________________________*/

class evenoddmul
{
  public static void main(String [] args)
  {
    int num=25619,m1=1,m2=1;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2!=0)
	  {
		m1=m1*c;
	  }
	
	 else
	  {
		m2=m2*c;
		

	  } 
	num=num/10;    
     }
  System.out.println("multiplication of odd digits is "+m1); 
  System.out.println("multiplication of even digits is "+m2);  
 }
}

/*_______________________________________________________________________________*/

class sumofevenoddmul
{
  public static void main(String [] args)
  {
    int num=25619,m1=1,m2=1;
    while(num>0)  
     {
	int c=num%10;
  	 if(c%2!=0)
	  {
		m1=m1*c;
	  }
	
	 else
	  {
		m2=m2*c;
		

	  } 
	num=num/10;    
     }
  System.out.println("The sum of multiplication of even and odd digits is "+(m1+m2)); 
 
 }
}
 

