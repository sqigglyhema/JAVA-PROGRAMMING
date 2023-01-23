import java.util.Scanner;
class nspat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,s=1;
System.out.print("Enter number of rows:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print(s*s+" ");
s++;
}
System.out.println();
}
}
}
