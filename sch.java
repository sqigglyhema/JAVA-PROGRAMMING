import java.util.*;
class sch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0,i;char l;
        System.out.println("Enter string:");
        String s=new String();
        s=sc.next();
        n=s.length();
        for(i=0;i<n;i++){
        l=s.charAt(i);
        if((Character.isLetterOrDigit(l)==false))
           c++;
        }
        System.out.println(c);
    }
