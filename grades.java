class grades
{
  public static void main(String[] args)
	{	
		int m1=49,m2=50,m3=14,E=45,P=40,C=30;
		int total=m1+m2+m3+E+P+C;
		double percentage=total/300.0*100;
		//System.out.println(percentage);
		if(m1>18 && m2>=18 && m3>=18 && E>=18 && P>=18 && C>=18)
		{
			if(percentage<=100 && percentage>90)
				System.out.println("The grade of the student is A+");
			else if(percentage<=90 && percentage>80)
				System.out.println("The grade of the student is A");
			else if(percentage<=80 && percentage>70)
				System.out.println("The grade of the student is B");
			else if(percentage<=70 && percentage>60)
				System.out.println("The grade of the student is C");
			else if(percentage<=60 && percentage>50)
				System.out.println("The grade of the student is D");
			else if(percentage<=50 && percentage>=35)
				System.out.println("The grade of the student is E");
		}
		else
		   	System.out.println("The Student hasn't passed all the subjects");

	}
}