import java.util.Scanner;
import java.lang.*;
class amsno{
public static int pow(int a,int b){
	int s=1;
	for(int i=0;i<b;i++)
	s=s*a;
	return(s);
}

public static int len(int a){
	int l=0,r=0;
	while(a!=0){
		r=r%10;
		l++;
		a=a/10;
	}
	return(l);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,ast=0,k,j,i,d;
System.out.print("Enter the number:");
n=sc.nextInt();
d=n;
k=len(n);
for(i=0;i<k;i++){
	j=d%10;
	ast+=pow(j,k);
	d=d/10;
	
}
System.out.println(ast);
if(n==ast)
System.out.print("Armstrong number");
else
System.out.print("Not an Armstrong number");
}
}
