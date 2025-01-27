//Comparison of two letters using Relational Operator

import java.util.Scanner;
public class Letter_Comparison{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a (in char): ");
char a=sc.next().charAt(0);
System.out.println("Enter the value of b (in char): ");
char b=sc.next().charAt(0);
sc.close();
System.out.println(a + " < " + b + " " + (a < b));
System.out.println(a + " <= " + b + " " + (a <= b));
System.out.println(a + " > " + b + " " + (a > b));
System.out.println(a + " >= " + b + " " + (a >= b));
System.out.println(a + " == " + b + " " + (a == b));
System.out.println(a + " != " + b + " " + (a != b));
}
}
