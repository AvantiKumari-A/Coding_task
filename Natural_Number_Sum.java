//Natural numbers and their sum

import java.util.Scanner;
class Natural_Number_Sum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n value of natural number: ");
int n=sc.nextInt();
sc.close();
int sum=(n*(n+1))/2;
System.out.println("Sum of "+ n + " natural numbers is: " + sum); 
}
}