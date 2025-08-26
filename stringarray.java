class SA
{
  public static void main(String args[])
  {
     String array[] = new String[]{"437","&&","hi namasthe"};
	 for(int i=0;i<array.length;i++)
	 {
		System.out.println(array[i]); //437 //&& //hi namasthe
	 }
	 System.out.println("__________________");
	 
	 int a[]=new int[4];
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a); // THIS PRINTS the address of this array a.
		System.out.println(a[i]); // 0  0  0  0
	 }
	 System.out.println("__________________");
	  
	 int a2[]={1,4,3,24,44};
	 for(int i=0;i<=(a2.length-1);i++)
	 {
		System.out.println(a2[i]);
	 }
	 System.out.println("__________________");
	 
	  double a3[] = new double[3];
	  for(int i=0;i<a3.length;i++)
	 {
		System.out.println(a3[i]);
	 }
	 System.out.println("__________________");
	 
  }
}