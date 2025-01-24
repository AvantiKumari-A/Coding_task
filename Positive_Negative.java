//Positive or negative number
import java.util.Scanner;
class Positive_Negative{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
sc.close();
if(n>0) //0 netural, greater than 0 -> positive numbers, less than 0 -> negative numbers 
{
System.out.println(n + " is positive");
}
else{
System.out.println(n + " is negative");
}
}
}