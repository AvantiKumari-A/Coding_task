//Comparison of two numbers using Relational Operator

import java.util.Scanner;
public class NumberComparison_RelationalOperator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt();
System.out.println("Enter the value of b: ");
int b=sc.nextInt();
sc.close();
System.out.println("\n" + "Comparison of two numbers using relational operator: ");
System.out.println(a + " == " + b + " " + (a == b));
System.out.println(a + " != " + b + " " + (a != b));
System.out.println(a + " < " + b + " " + (a < b));
System.out.println(a + " <= " + b + " " + (a <= b));
System.out.println(a + " > " + b + " " + (a > b));
System.out.println(a + " >= " + b + " " + (a >= b));
}
}