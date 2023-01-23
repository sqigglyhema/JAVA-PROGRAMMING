import java.util.Scanner;
class si{
public static double simple(int n,int t,double r){
return((n*r*t)/100);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,y;
char c;
double x=0.10;
System.out.print("Enter pricipal amount:");
a=sc.nextInt();
System.out.print("Enter time:");
y=sc.nextInt();
System.out.print("Is customer a senior citizen:");
c=sc.next().charAt(0);
if(c=='y')
x=0.12;
System.out.print("Intrest:"+
