import java.util.Scanner;
class TwoDArray
{
	public static void main (String [] E)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the rows");
		int m=sc.nextInt();
		System.out.println("Enter the size of the columns");
		int n=sc.nextInt();
		System.out.println();
		int [] [] a= new int [m][n];
		
		System.out.println(a.length);//size of rows
		System.out.println(a[0].length);//size of columns
		System.out.println();
		
	System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}

//___________________________________________________________________________

class TransposeMatrix
{
	public static void main (String [] E)
	{
		int [] [] a= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("the given matrix is");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("the transpose matrix is");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}

//___________________________________________________________________________

class AddMatrix
{
	public static void main (String [] E)
	{
		int [] [] a= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int [] [] b= new int [][]{{3,2,1},{6,5,4},{9,8,7}};
		int [] [] c=new int [a.length][a[0].length];
		System.out.println("the given matrix is");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				c[i][j]=a[i][j]+b[i][j];
		}
		
		System.out.println("the addition of matrixes is");
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}

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
















































































