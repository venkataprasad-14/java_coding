//sum of first dailagonal s1,second diagonal s2 , s1-s2
//sum of all elementsin array,sum of each row,sum of column,count the number of in a 2d array
//addition and subtraction of 2 matrixes.
//find the max and min element in matrix, in all rows and columns

class SumofLeftDiag
{
	public static void main (String [] E)
	{
		int [] [] a= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum1=0;
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			//for(int j=3;j<a[i].length;j--)
				sum1+=a[i][j];
		}
		System.out.println("the sum of diagonal is " + sum1);
	}
}
	
//_____________________________________________________________________________________________

class SumofRightDiag
{
	public static void main (String [] E)
	{
		int [] [] a= new int [][]{{1,2,3},{4,9,6},{7,8,9}};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
				sum1+=a[i][i];
		}
		System.out.println("the sum of diagonal is " + sum1);
	}
}

//_____________________________________________________________________________________________






















