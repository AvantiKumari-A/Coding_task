import java.util.Scanner;
public class ForLoop_outside_Initialization{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
int i=1;
System.out.print("The first " + n + " natural numbers is: ");
for(;i<=n;i++)
{
if(i==n){
System.out.print(i);
}
else{
System.out.print(i + ", ");
}
}
}
}