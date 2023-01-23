import java.util.Scanner;
class cpat{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,l,b;
char c;
System.out.print("Enter length:");
l=sc.nextInt();
System.out.print("Enter breadth:");
b=sc.nextInt();
System.out.print("Enter character:");
c=sc.next().charAt(0);
for(i=0;i<l;i++){
for(j=0;j<b;j++){
System.out.print(c+" ");
}
System.out.println();
}
}
}
