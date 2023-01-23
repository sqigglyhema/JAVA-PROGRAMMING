import java.util.Scanner;
class npat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,k;
System.out.print("Enter number to be printed:");
k=sc.nextInt();
System.out.print("Enter number of rows:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print(k);
}
System.out.println();
}
for(i=n-2;i>-1;i--){
for(j=0;j<=i;j++){
System.out.print(k);
}
System.out.println();
}
}
}
