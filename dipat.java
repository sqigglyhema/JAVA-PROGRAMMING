import java.util.Scanner;
class dipat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.print("Enter number of rows:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			k=n-i+1;
			while(k>0)
			{
				System.out.print(" ");
				k--;
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		n=n-1;
		for(i=n-1;i>=0;i--)
		{
			System.out.print(" ");
			k=n-i+1;
			while(k>0)
			{
				System.out.print(" ");
				k--;
			}
			for(j=i;j>=0;j--)
			{	
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
