import java.util.*;
class ssort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of elemnts:");
        n=sc.nextInt();
        String s=new String();
        ArrayList<String> a=new ArrayList<String>();
        for(i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+":");
            s=sc.next();
            a.add(s);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
Footer
