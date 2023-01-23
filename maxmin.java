import java.util.Scanner;
class maxmin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,m,t,s,d,i,j,u;
System.out.print("Enter number of elements:");
t=sc.nextInt();
int a[]=new int[t];
for(i=0;i<t;i++){
System.out.print("PEnter element "+(i+1)+": ");
a[i]=sc.nextInt();
}
for(i=0;i<t;i++){
for(j=0;j<t;j++){
	if(a[i]>a[j]){
		u=a[i];
		a[i]=a[j];
		a[j]=u;
	}
}
}
System.out.print("Enter m:");
m=sc.nextInt();
System.out.print("Enter n:");
n=sc.nextInt();
System.out.println(n+" maximum number:"+a[m-1]);
System.out.println(m+" minimum number:"+a[t-n]);
System.out.println("Sum:"+(a[t-n]+a[m-1]));
System.out.println("Difference:"+(-a[t-n]+(a[m-1])));
}}
