package javaPractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter where you want to start the series");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter when you want to end the series");
		int n=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=a; i<=n; i++)
		{
			int c=a+b;
			a=b;
			b=c;
			if(c>=n)
				break;
			System.out.print(c+" ");
			
		}
	}

}
