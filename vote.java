import java.util.Scanner;
class vote{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.print("Enter age:");
age=sc.nextInt();
if(age>=18)
	System.out.print("Eligible to vote");
else
	System.out.print("Eligible to vote after "+(18-age)+" years");
}
}
