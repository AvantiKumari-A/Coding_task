//to find greatest among 3 using ternary operator

import java.util.Scanner;
public class Ternary_operator_GreatestAmong3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 3 numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int greater= (a>b && a>c)? a : (b>a && b>c) ? b : c;
System.out.println(greater + " is the greatest number");
}
}
//(ternary operator syntax)
//condition ? true : false;
