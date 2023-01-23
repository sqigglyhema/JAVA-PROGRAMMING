import java.util.Scanner;
class uname{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=new String();
String s2=new String();
System.out.print("Enter username:");
s1=sc.next();
System.out.print("Re-enter username:");
s2=sc.next();
if(s1.equals(s2))
	System.out.print("Username valid!");
else
	System.out.print("Username is not valid!");
}
}
