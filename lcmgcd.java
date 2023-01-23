import java.util.Scanner;
class lcmgcd{
    static int gcd(int a,int b){
        if(b==0)
        return a;
        else
        return(gcd(b,a%b));
    }
    static int lcm(int a,int b,int c){
        return((a*b)/c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter number 1:");
        x=sc.nextInt();
        System.out.println("Enter number 2:");
        y=sc.nextInt();
        z=gcd(x,y);   
        System.out.println("GCD:-"+z);
        System.out.println("LCM:-"+lcm(x,y,z));
        }
