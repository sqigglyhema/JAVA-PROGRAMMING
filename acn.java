import java.util.Scanner;
class acn{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,p=0,a,k;
System.out.print("Enter number of elements:");
a=sc.nextInt();
int b[]=new int [a];
for(i=0;i<a;i++){
System.out.print("Enter element"+(i+1)+":");
b[i]=sc.nextInt();
}

for(k=0;k<a;k++){
n=b[k];
for(i=2;i<=((n/2)+1);i++){
if(n%i==0){
p++;
break;}
}}
System.out.println("Number of composite numbers are:"+p);
}
}
