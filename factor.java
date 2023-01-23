import java.util.Scanner;
class factor{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,p=0;
System.out.print("Enter number:");
n=sc.nextInt();
System.out.print("Factors of n are:");
for(i=1;i<=((n/2)+1);i++){
if(n%i==0){
System.out.print(i+",");
p++;
}
}
System.out.println(n);
System.out.println("Number of factors are:"+p);
}
}
