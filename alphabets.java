//iterate the loop from 1-200 and print the albhabets.

class alphabets
{
  public static void main(String [] args)
  {
    for(int i=1;i<=200;i++)
    {
	char ch=(char)(i);
      if(ch>='A' && ch<='Z')
	System.out.println(ch);
      else if(ch>='a' && ch<='z')
	System.out.println(ch);
    }

  }
}

//if i get 'A' then output should be 'a'

//Toggle case= capital vunna chota small ravali, small unna chota capital ravali.


class alphabets1
{
  public static void main(String [] args)
  {
    for(int i=1;i<=200;i++)
    {
	char ch=(char)(i);
      if(ch>='A' && ch<='Z')
	System.out.println((char)(ch+32));
      
    }

  }
}

/*class alphabets2
{
  public static void main(String [] args)
  {
    for(int i=1;i<=200;i++)
    {
	char ch=(char)(i);
      if(ch>='A' && ch<='Z')
	System.out.println((char)(ch+32));
      if(ch>='a' && ch<='z')
	System.out.println((char)(ch-32));
    }

  }
}*/