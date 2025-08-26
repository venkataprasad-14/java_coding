class StrPalindrome
{
	public static void main(String [] args)
	{
		String s=new String("MADAMA");
		String copy="";
		char [] ch =s.toCharArray();
		for(int i=ch.length-1;i>=0;i-- )
		{
			copy+=ch[i];
		}
		if(s.equals(copy))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}
	
}