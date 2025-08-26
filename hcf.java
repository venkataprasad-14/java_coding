class hcf
{
   public static void main(String [] args)
   {
     int n1=56,n2=72,n,hcf=0;
	 //now find the smallest element in given numbers,so that i can iterate to that number for factors
     if(n1>n2)
		n=n2;
     else
        n=n1;
     for(int i=1;i<=n; i++)
     {
		if(n1%i==0 && n2%i==0)//finding common factors for both numbers
		{
			hcf=i;	
		}
     }
   System.out.println("The highest common factor for 56 and 72 is "+ hcf);
  
   }
}

//2nd way

class hcf2
{
   public static void main(String [] args)
   {
     int n1=4,n2=6,n,hcf=0;
   /*if(n1>n2)
		n=n2;
     else
        n=n1; */
     for(int i=1;i<=n1 && i<=n2; i++) //i=1;1<=4 && 1<=6 (t)//2<=4 &&2<=6 (t) // 3<=4 && 3<=6 (t) //4<=4 && 4<=6 (t)/4/ 5<=4 && 5<=6 (f) 
      {
		if(n1%i==0 && n2%i==0) //4%1==0 && 6%1==0 (t)//4%2==0 && 6%2==0 (t)//4%3==0 && 6%3==0 (f)// 4%4==0 && 6%4==0 (f)
		{
			hcf=i; //1 //2
		}
     }
   System.out.println("The highest common factor for "+ n1 +" and "+ n2 +" is "+ hcf);
  
   }
}


/*__________________________________________________________________________________________________*/

//print factors in reverse order



class revfactors
{
  public static void main(String [] args)
  {
    


  }
}