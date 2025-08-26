class arguments
{
  public static void main(String [] args)
  {
     methods m1 = new methods();
	 m1.method1();
	 m1.method2(2,3);
	 m1.method2(2,'V',4.0);
  }
}

class methods
{
   void method1()
   {
		System.out.println("Empty");
   }
   void method2(int x,int y)
   {
		System.out.println(x+y);
   }
   void method2(int x, char y, double z)
   {
	    System.out.println(x);
		System.out.println(y);
		System.out.println(z);
   }
}