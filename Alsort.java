import java.util.*;
class alsort{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n;
char t;
String a=new String();
System.out.print("Enter string:");
a=sc.next();
n=a.length();
char c[]=new char [n];
c=a.toCharArray();
for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		if(c[i]<c[j]){
			t=c[i];
			c[i]=c[j];
			c[j]=t;
		}
	}
}
String s2=new String(c);
System.out.print("String after sorting:"+s2);
}
}
