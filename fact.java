import java.util.Scanner;
class fact{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,f=1;
System.out.print("Enter number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
f*=i;
System.out.print("Factorial is:"+f);
}
