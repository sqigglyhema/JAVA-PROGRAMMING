import java.util.Scanner;
class hsqpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.print("Enter size of square:");
n=sc.nextInt();
for(i=0;i<n;i++){
for(j=0;j<n;j++){
if((i==0)||(j==0)||(i==(n-1))||(j==(n-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
Footer
