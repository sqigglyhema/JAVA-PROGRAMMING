import java.util.Scanner;
import java.lang.*;
class rn{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long n,k;
double s;
System.out.print("Enter number:");
n=sc.nextInt();
s=Math.sqrt(n);
k=Math.round(s);
if(s%k==0)
System.out.println("Square roots of "+n+" are: "+k+" and "+(k*-1));
else
	System.out.println(n+" is not a perfect square number:");
}
}
