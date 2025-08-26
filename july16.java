class divisible_by


{
	public static void main(String [] args)
	{
		int a=44;
		if(a%3==0)
			System.out.println("number is divisible by 3");
		else
			System.out.println("number is not divisible by 3");
	}
}

//______________________________________________________________________
class Main1
{
    public static void main(String[] args) {
        int price1 = 300, qty1 = 2, t1 = price1 * qty1;
        int price2 = 399, qty2 = 4, t2 = price2 * qty2;
        int price3 = 499, qty3 = 3, t3 = price3 * qty3;
        int price4 = 50,  qty4 = 2, t4 = price4 * qty4;
        int price5 = 10,  qty5 = 2, t5 = price5 * qty5;
        int price6 = 100, qty6 = 20, t6 = price6 * qty6;

        int total_price = t1 + t2 + t3 + t4 + t5 + t6;
        double CGST = total_price * 0.09;
        double SGST = total_price * 0.09;
        double Tax = total_price * 0.18;
        double total = total_price + CGST + SGST + Tax;
		String paymentmode="upi";
		double discount=0;

        System.out.println("          ABHI_RUCHI_RESTAURANT         ");
        System.out.println("    	 Address: Tadepalligudem         ");
        System.out.println("   		  Phn No: 9652858955         ");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _  _  _");
        System.out.println("Item\t\tPrice\tQuantity\tTotal");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Chicken 65\t" + price1 + "\t" + qty1 + "\t\t" + t1);
        System.out.println("Biryani\t\t" + price2 + "\t" + qty2 + "\t\t" + t2);
        System.out.println("Fry Biryani\t" + price3 + "\t" + qty3 + "\t\t" + t3);
        System.out.println("Water Bottle\t" + price4 + "\t" + qty4 + "\t\t" + t4);
        System.out.println("Cool Drink\t" + price5 + "\t" + qty5 + "\t\t" + t5);
        System.out.println("Ice Creams\t" + price6 + "\t" + qty6 + "\t\t" + t6);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Total\t\t\t\t\t" + total_price);
        System.out.println("CGST(9%)\t\t\t\t" + CGST);
        System.out.println("SGST(9%)\t\t\t\t" + SGST);
        System.out.println("Tax(18%)\t\t\t\t" + Tax);
        System.out.println("_ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Total bill is\t\t\t\t" + total);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        if (paymentmode=="upi")
			discount=total*10/100;
		else
			discount=total*5/100;
	
		System.out.println("discount is \t\t\t\t"+ discount); 
        System.out.println("The Final total after discount is \t"+ (total-discount));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		
	System.out.println("                You paid the bill              ");	
	System.out.println("                Thank You!                 ");
		
	}
}
//___________________________________________________________________________
class smallest
{
	public static void main(String[] args)
	{
		int a=4,b=25;
		if(a<b)
		{
		   System.out.println(a+" is the smallest number");	
		}	
		else
		System.out.println(b+" is the smallest number");
	}
}
//______________________________________________________________________

class LastEvenOdd
{
	public static void main(String [] args)
	{
		int a=27;
		int x=a%10;
		if(x%2==0)
			System.out.println(x+" is EVEN");
		else
			System.out.println(x+" is ODD");
	}

}
//______________________________________________________________________


class check
{
	public static void main(String [] args)
	{
	   int num=15,a=25,b=45;
	   if(num%5==0)
	    {	
		a=a+b; //
		b=a-b;
		a=a-b;
		System.out.println("The values of a,b after swapping are "+a+","+b);
	    }
	   else
	     {
		System.out.println("The sum of a and b is "+ (a+b));
	     }
	}
}

//______________________________________________________________________


class perfectsquare
{
	public static void main(String[]args)
	{
		int a=25;
		double result=Math.sqrt(a);
		if( result==(int)result )
			System.out.println("Perfect Square Number");
		else
			System.out.println("Not a Perfect Square Number");
		
	}
}

