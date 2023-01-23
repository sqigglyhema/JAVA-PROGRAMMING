import java.util.Scanner;
class skip{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m,n,k,i;
System.out.print("M:");
m=sc.nextInt();
System.out.print("N:");
n=sc.nextInt();
System.out.print("K:");
k=sc.nextInt();
for(i=m;i<n;i+=k)
System.out.println(i);
}}
