import java.util.Scanner;
class srv{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=new String();
String v=new String();
v="";
System.out.print("Enter string:");
s=sc.next();
int i,n=0;char c;
for(i=0;i<(s.length());i++){
	c=s.charAt(i);
	if((c!='A')&&(c!='a')&&(c!='E')&&(c!='e')&&(c!='I')&&(c!='i')&&(c!='O')&&(c!='o')&&(c!='U')&&(c!='u'))
		v+=c;;
}
System.out.print("String after removal of vowels:"+v);
}
