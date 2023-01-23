import java.util.Scanner;
class perfect{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,p=0;
System.out.print("Enter number:");
n=sc.nextInt();
for(i=1;i<=((n/2)+1);i++){
if(n%i==0)
p+=i;
}
if(p==n)
	System.out.print(n+" is perfect number");
else
	System.out.print(n+" is not perfect number");
}
}
