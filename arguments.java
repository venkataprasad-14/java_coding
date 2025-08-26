class arguments
{
  public static void main(String [] args)
  {
     methods m1 = new methods();
	 m1.method2(4,4);//actual arguments
  }
}

class methods
{
   void method1()
   {
		System.out.println("Empty");
   }
   void method2(int x,int y)//formal arguments
   {
		System.out.println(x+y);
   }
   void method2(int x, char y, double d)
   {
	    System.out.println(x);
		System.out.println(y);
		System.out.println(d);
   }
}

//________________________________________________________________//


class pd
{
	public static void main(String [] args)
	{
		productM p1=new productM();
		double total=p1.total(45,2);
	    System.out.println("total is"+ total);
	    double discount=p1.discount(total);
		System.out.println("discount is"+ discount);
	    p1.finalbill(total,discount);
	}
}

 class productM
 {
	 double total(double price, int quantity)
	 {
		 double total=price*quantity;
		 return total;
	 }
	 double discount(double total)
	 {
		 double discount=total*12/100;
		 return discount;
	 }
	 void finalbill(double total,double discount)
	 {
		 double finalbill=total-discount;
		 System.out.println("finalbill is "+ finalbill);
	 }
	 
 }