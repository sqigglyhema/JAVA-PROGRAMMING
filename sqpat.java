import java.util.Scanner;
class sqpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.print("Enter size of square:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n;j++){
System.out.print("* ");
}
System.out.println();
}
}
}
