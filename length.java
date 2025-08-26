import java.util.Scanner;
class VowelsConsonants
{
	public static void main(String [] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("The lenth of the string is "+s1.length());
		
		int count1=0,count2=0,count3=0;
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				count1++;
			else if(ch[i]==' ')
				count3++;
			else
				count2++;
			
		}
		System.out.println("There are "+count1+" vowels in the string");
		System.out.println("There are "+count2+" consonants in the string");
	}
}

//================================================================================

class UPNSS
{
	public static void main(String [] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("The lenth of the string is "+s1.length());
		
		int count1=0,count2=0,count3=0,count4=0,count5=0;
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' )
				count1++;
			else if(ch[i]>='a' && ch[i]<='z')
				count2++;
			else if(ch[i]==' ')
				count3++;
			else if(ch[i]>='1' && ch[i]<='9')
				count4++;
			else 
				count5++;
			
		}
		
		System.out.println("There are "+count1+" Uppercase letters in the string");
		System.out.println("There are "+count2+" lowercase letters in the string");
		System.out.println("There are "+count3+" spaces in the string");
		System.out.println("There are "+count4+" numbers letters in the string");
		System.out.println("There are "+count5+" Symbols in the string");
	}
}

//================================================================================

class words
{
	public static void main(String [] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("The lenth of the string is "+s1.length());
		
		int count1=0;
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' )
				count1++;
		}
		
		System.out.println("There are "+ ++count1+" words in the string");
		
	}
}

//================================================================================

class words2
{
	public static void main(String [] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("The lenth of the string is "+s1.length());
		
		String [] arr=s1.split(" ");
	
		System.out.println("There are "+ arr.length +" words in the string");
		
	}
}

//================================================================================

class Togglecase
{
	public static void main(String [] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char c=sc.next().charAt(0);
		String copy= "";
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				copy+=(char)(ch[i]+32);
			else if(ch[i]>='a' && ch[i]<='z')
				copy+=(char)(ch[i]-32);
			else
				copy+=ch[i];
		}
		System.out.println(copy);
		System.out.println(c);
	}
}