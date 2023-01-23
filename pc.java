import java.util.Scanner;
class pc{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,k,p=0,pc=0,npc=0;
System.out.print("Enter number of elements:");
k=sc.nextInt();
int x[]=new int[k];
for(i=0;i<k;i++){
p=0;
System.out.print("PEnter element "+(i+1)+": ");
x[i]=sc.nextInt();
n=x[i];
for(j=2;j<=((n/2)+1);j++){
if(n%j==0){
p=1;
break;}}
if(p==0)
	pc++;
else
	npc++;
}
System.out.println("Prime count:"+pc);
System.out.println("Composite count:"+npc);
}
}
