// count symbols,spaces,capital ,small letters

class count_ch_in_array
{
	public static void main(String [] args)
	{
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		char [] ch=new char[]{' ', '"', '%', 'L','o', 'r','A'};
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count1++;
				
			else if(ch[i]>='a' && ch[i]<='z')
				count2++;
				
			else if(ch[i]>='0' && ch[i]<='9')
				count3++;
		
			else if(ch[i]==' ')
				count4++;
			
			else 
				count5++;
		}
		System.out.println("n.o of capital letters are "+count1);
		System.out.println("n.o of small letters are "+count2);
		System.out.println("n.o of numbers letters are "+count3);
		System.out.println("n.o of spaces are "+count4);
		System.out.println("n.o of symbols are "+count5);
	}
}
			