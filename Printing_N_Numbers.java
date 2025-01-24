//To print n numbers
import java.util.Scanner;
class Printing_N_Numbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
System.out.println("The numbers are:");
for(int i=0; i<=n; i++)
{
System.out.println(i);
}
}
}
