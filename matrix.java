import java.util.*;
class ma{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter rows");
        r=sc.nextInt();
        System.out.println("Enter columns");
        c=sc.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        int m3[][]=new int[r][c];
        System.out.println("Matrix 1");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 2");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }}
