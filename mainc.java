class mainc
{
   public static void main(String [] args)
   {	
	System.out.println("Before method calling");
	meth obj=new meth();
	obj.add();
	obj.method1();
	obj.sub();
	obj.mul();
	System.out.println("After method calling");
   }
}

class meth
{
   void add()
   {
	int a=10,b=5;
	System.out.println(a+b);
   }
   void method1()
   {
     System.out.println("Empty");
   }
   void sub()
   {
	int a=10,b=5;
	System.out.println(a-b);
   }
   void mul()
   {
	int a=10,b=5;
	System.out.println(a*b);
   }
}


class main2
{
   public static void main(String [] args)
   {	
	
	methods obj=new methods();
	System.out.println(obj.add());
	System.out.println(obj.method1());
	System.out.println(obj.sub());
	System.out.println(obj.mul());
	System.out.println(obj.div());
	System.out.println(obj.method2());
	
   }
}

class methods
{
    int add()
   {
	int a=10,b=5;
	return (a+b);
   }
   char method1()
   {
     return 'y';
   }
   long sub()
   {
	long a=17985894940l,b=52345678865l;
	return (a-b);
   }
   double mul()
   {
	double a=10,b=5;
	return (a*b);
   }
   boolean div()
   {
	int a=4,b=2;
	return (a/b==0);
   }
   String method2()
   {
     return "Empty";
   }

}
