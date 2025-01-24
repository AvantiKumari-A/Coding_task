//Sum of n numbers
import java.util.Scanner;
class Sum_of_N_Numbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
int sum=0;
for(int i=0; i<=n; i++)
{
sum+=i;
}
System.out.println("The sum of N numbers is : " + sum);
}
}
