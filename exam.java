class exam{
	public static void main(String args[]){
		/*
		for(int x = 1;x<=10000;x++){
			int num = x, count = 0;
			for(int y =1;y<=num/2;y++){
				if(num%y==0){
					count++;
				}
			}
			if(count==1){
				System.out.println(num+" is a prime number");
			}
		}

		for(int x = 1;x<=1000;x++){
			int num = x, copy = num, rev = 0;
			while(num!=0){
				int rem = num%10;
				rev = rev *10+rem;
				num/=10;
			}
			if(rev == copy){
				System.out.println(rev +" is a palindrome");
			}

		}


		for(int x = 1;x<=1000;x++){
			int num = x, copy = num, count = 0;
			int result = 0;
			while(num!=0){
				count++;
				num/=10;
			}
			num = copy;
			while(num!=0){
				int rem = num%10;
				result = result +(int) Math.pow(rem,count);
				num/=10;
			}
			if(result==copy){
				System.out.println(result +" is a Armstrong");
			}
		}

		for(int x = 1;x<=1000;x++){
				int year = x;
				if((year%4==0 && year%100!=0)|| year%400==0){
		System.out.println("leap year "+year);
}
		}



for(int x = 1;x<=10;x++){
			int num = x;
			for(int y =1;y<=10;y++){
				System.out.println(x+" X "+ y+" = "+(num * y));
			}
		}





		int num = 123456789;
		int max = 0;
		while(num!=0){
			int rem = num%10;
			max = Math.max(rem,max);
			num/=10;
		}
		System.out.println("largest digit in a number is "+ max);


		int num = 123456789;
		int max = 0;
		int second = 0;
		while(num!=0){
			int rem = num%10;
			max = Math.max(rem,max);
			if(rem>second && rem!=max){
				secound = rem;
			}
			num/=10;
		}
		System.out.println(second);
		

		int input = 45;  int sum =0;
		int result = input*input;
		while(result!=0){
			int rem = result %10;
			sum = sum +rem;
			result/=10;
		}
		if(sum == input){
			System.out.println("Evil number");
		}else{
			System.out.println("Not an Evil number");
		}

		int num = 132;
		int prod = 1, sum =0;

		while(num!=0){
			int rem = num %10;
			sum = sum + rem;
			prod = prod * rem;
			num/=10;
		}
		if(sum==prod){
			System.out.println("power number");
		}
		


		int num = 76;
		int mul = num * num;
		System.out.println(mul);
		int copy = mul;
		int res = 0;
		int count = 0;
		while(mul !=0){
			int rem = mul %10;
			res = res*10+rem;
			if(res==num){
				count++;
			}
			mul/=10;
		}
		mul = copy;
		int ans = 0;
		System.out.println(res);
		while(res !=0){
			int rem = res %10;
			ans = ans*10+rem;
			if(ans==num){
				count++;
			}
			res/=10;
		}
		
		System.out.println(ans);
		if(count == 1){
			System.out.println("Automatic  number");
		}else{
			System.out.println("Not an automatic  number");
		}
		
		int num = 2025;
2024%100   2024/100
		int count = 0;
		int copy = num;
		while(num!=0){
			count++;
			num/=10;
		}
		System.out.println(count);
		num = copy;
		int x = 0;
		int ans = 0;
		while(x<count/2 && num!=0){
			int rem = num%10;
			ans = ans*10+rem;
			x++;
			num/=10;
		}
		System.out.println(ans);
		int c = 0;
		while(ans!=0){
			int rem = ans%10;
			c = c*10+rem;
			ans/=10;
		}
		System.out.println(c);
		System.out.println(num);
		int result = num + c;
		int result2 = result * result;
		if(result2 == copy){
			System.out.println("Technology number");
		}else{
			System.out.println("Not a Technology number");
		}
		

		int num = 21;
		if(num%10==7){
			System.out.println("Busy number");
		}
		if(num%7==0){
			System.out.println("Busy number");
		}else{
			System.out.println("Not a busy number");
		}
		*/
		

		















	}
}