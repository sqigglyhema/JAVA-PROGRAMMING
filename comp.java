import java.util.Scanner;
class comp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,p=0,a,b,k;
System.out.print("Enter a:");
a=sc.nextInt();
System.out.print("Enter b:");
b=sc.nextInt();
System.out.println("Composite numbers between "+a+" and "+b+" are:");
for(n=a;n<=b;n++){
p=0;
for(i=2;i<=((n/2)+1);i++){
if(n%i==0){
p=1;
break;}}
if(p!=0)
	System.out.print(n+" ");
}
}
}
Output:
