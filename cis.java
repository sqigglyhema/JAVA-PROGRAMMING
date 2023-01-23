import java.util.Scanner;
class cis{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=new String();
char c,k;
int i,l=0;
System.out.print("Enter string:");
s=sc.next();
System.out.print("Enter character to find occurance:");
c=sc.next().charAt(0);
for(i=0;i<(s.length());i++){
	k=s.charAt(i);
	if(c==k){
		System.out.println(c+" is found at "+(i+1)+" position in "+s);
		l++;
	}
}
if(l==0)
	System.out.print(c+" is not found in "+s);
}
}
