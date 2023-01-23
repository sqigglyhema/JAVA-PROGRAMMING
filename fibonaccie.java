import java.util.Scanner;
class fib{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,f=0,l=1,m;
System.out.print("Enter number of terms:");
n=sc.nextInt();
System.out.print(f+" "+l+" ");
for(int i=0;i<n-2;i++){
m=f+l;f=l;l=m;
System.out.print(m+" ");
}
}}
Footer
