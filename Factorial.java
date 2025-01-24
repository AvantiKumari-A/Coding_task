//Factorial of the number
import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find the fact: ");
int n=sc.nextInt();
int fact=1; //should be 1
for(int i=1; i<=n; i++)  //in for i should start with 1
{
fact*=i;
}
System.out.println("The factorial of " + n + " is: " + fact);
}
} 

