package javaPractice;

import java.util.Scanner;

public class SumOfDigits {
	int a,b;
	
	int Sum(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		SumOfDigits obj1= new SumOfDigits();
		int sum=obj1.Sum(a,b);
		System.out.println("The sum of two digits is "+sum);
	}

}
