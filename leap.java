class leap
{
 public static void main(String [] args)
 {
   int year,count=0; //1543//1150
   for(year=1543;year>=1530;year--)
   {
     if(year%4==0 && (year%100!=0 || year%400==0))
      {

	count++;
	
	System.out.println(year + (" is leap year"));
	
      }
    
   }
  System.out.println("Total number of leap years between 1543 and 1150 is "+count);
 }
}