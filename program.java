import java.util.Scanner;
class ttt{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int i,j,k;
void st(){
for(i=0;i<3;i++){
	for(j=0;j<3;j++)
		a[i][j]=0;
}}
static void xt(){
	System.out.println("Player X turn!!");
	int r,c;
	System.out.print("Enter row:");
	r=sc.nextInt();
	System.out.print("Enter column:");
	c=sc.nextInt();
	}
static void ot(){
	System.out.println("Player X turn!!");
	int r,c;
	System.out.print("Enter row:");
	r=sc.nextInt();
	System.out.print("Enter column:");
	c=sc.nextInt();
	}
static void pt(){
	System.out.print("# # # # # # # \n");
	for(i=0;i<3;i++){
	for(j=0;j<3;j++){
	k=a[i][j];
	if(k==0)
		System.out.print("# "+"  ");
	else if(k==1)
		System.out.print("# "+"x ");
	else if(k==2)
		System.out.print("# "+"o ");
	}
	System.out.print("#\n# # # # # # # \n");
	}
}	
int win(int a[][]){	
	if(
	a[0][0]==a[0][1]==a[0][2]||
	a[1][0]==a[1][1]==a[1][2]||
	a[2][0]==a[2][1]==a[1][2]||
	a[0][0]==a[1][0]==a[2][0]||
	a[0][1]==a[1][1]==a[2][1]||
	a[0][2]==a[1][2]==a[2][2]||
	a[0][0]==a[1][1]==a[2][2]||
	a[0][2]==a[1][1]==a[2][0])
	return 1;
	else
		return 0;
	
	}
}
class prog1{
public static void main(String args[]){
	ttt obj=new ttt();
	ttt.st();
while(ttt.win(a)!=1){
	ttt.xt();
	ttt.ot();
	ttt.pt();
}
}
}
