import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,p=0;
System.out.print("Enter number:");
n=sc.nextInt();
for(i=2;i<=((n/2)+1);i++){
if(n%i==0){
p=1;
break;}}
if(p==0)
	System.out.print(n+" is prime number");
else
	System.out.print(n+" is not prime number");
}
}
