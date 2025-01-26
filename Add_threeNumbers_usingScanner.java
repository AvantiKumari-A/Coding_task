/* You have three numbers, and your challenge is to write a program that reads these
numbers and computes their total sum. */

import java.util.Scanner;
public class Add_threeNumbers_usingScanner{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt();
System.out.println("Enter the value of b: ");
int b=sc.nextInt();
System.out.println("Enter the value of c: ");
int c=sc.nextInt();
sc.close();
int sum = a+b+c;
System.out.println("Sum of three numbers is: " + sum);
}
}
