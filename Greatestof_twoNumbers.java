/* Imagine you have two mysterious numbers. Your task is to write a program that
reveals which one of them is the bigger one. */

import java.util.Scanner;
public class Greatestof_twoNumbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt();
System.out.println("Enter the value of b: ");
int b=sc.nextInt();
sc.close();
if(a>b){
System.out.println(a + " is greater than " + b);
}
else if(b>a){
System.out.println(b + " is greater than " + a);
}
else{
   System.out.println("Both the numbers are equal"); 
}
}
}
