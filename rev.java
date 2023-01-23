import java.util.Scanner;
class rev{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=new String();
String r=new String();
int i;
System.out.print("Enter string:");
s=sc.next();
r="";
for(i=(s.length()-1);i>=0;i--)
r+=s.charAt(i);
System.out.print("Reverse is:"+r);
}
}
