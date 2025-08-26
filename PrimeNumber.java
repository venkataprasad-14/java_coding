package javaPractice;

import java.util.Scanner;

public class PrimeNumber {
	void checkPrime(int n) {
		
		for(int i=2;i<n/2;i++) {
			int count=0;
			if(n/i==0) {
				 count++;
			}
			if(count==0)
				System.out.println(n);
		}
		

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int x=sc.nextInt();
		int y=sc.nextInt();
		PrimeNumber obj= new PrimeNumber();
		  for(int z=x;z<=y;z++) {
			  obj.checkPrime(z);
		  }
	}

}
