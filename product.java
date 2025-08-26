//import java.util.Scanner;
class main
{
   public static void main(String [] args)
   {
	//System.out.println("Enter product details");
	//Scanner sc=new Scanner(System.in);
	product og=new product();
	og.product_id=1;
	og.product_name="Apple";
	og.quantity=2;
	og.p_price=25;
	og.print1();
	og.print2();
	System.out.println("--------------------------");
	product og1=new product();
	og1.product_id=2;
	og1.product_name="Orange";
	og1.quantity=3;
	og1.p_price=20;
	og1.print1();
	og1.print2();

	System.out.println("The Final Total is "+(og.final_price() + og1.final_price()));
   }
} 

class product
{
   int product_id,quantity;
   String product_name;
   double p_price;
    
    void print1()
    {
        System.out.println("Product id is "+product_id);
	    System.out.println("Product name is "+product_name);
	    System.out.println("item Quanity "+quantity);
	    System.out.println("Cost per item "+p_price);

    }
   
   double total_price()
   {
     double total_price=p_price*quantity ;
     return total_price;
   }
   
   double tax()
   {
     double tax=total_price()*0.18;
     return  tax;
   }
   double final_price()
   {
     double final_price= total_price() + tax();
	return final_price;
   }
  void print2()
   {
        System.out.println("Total price is "+ total_price());
	System.out.println("Tax is "+ tax());
	System.out.println("Final price is "+ final_price());
   }

}
