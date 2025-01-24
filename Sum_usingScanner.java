/* You have two numbers, and your task is to write a program that reads these numbers
and calculates their sum. */

import java.util.Scanner;
public class Sum_usingScanner{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt();
System.out.println("Enter the value of b: ");
int b=sc.nextInt();
sc.close();
int sum = a+b;
System.out.println("Sum of a + b is: " + sum);
}
}