

import java.util.Scanner;
class revnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,r=0;
System.out.print("Enter number:");
n=sc.nextInt();
while(n!=0){
r=(r*10)+(n%10);
n=n/10;
}
System.out.println("Reverse:"+r);
}}

