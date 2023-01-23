import java.util.Scanner;
class hrecpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,l,b;
System.out.print("Enter length:");
l=sc.nextInt();
System.out.print("Enter breadth:");
b=sc.nextInt();
for(i=0;i<l;i++){
for(j=0;j<b;j++){
if((i==0)||(j==0)||(i==(l-1))||(j==(b-1)))
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
