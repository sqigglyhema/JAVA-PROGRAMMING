import java.util.Scanner;
class recpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,l,b;
System.out.print("Enter length:");
l=sc.nextInt();
System.out.print("Enter breadth:");
b=sc.nextInt();
for(i=0;i<l;i++){
for(j=0;j<b;j++){
System.out.print("* ");
}
System.out.println();
}
}
}
