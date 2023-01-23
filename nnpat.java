import java.util.Scanner;
class nnpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.print("Enter number of rows:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print(i+1);
}
System.out.println();
}
}
}
