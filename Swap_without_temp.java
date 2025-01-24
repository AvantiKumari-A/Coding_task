//Swap numbers without using third variable

import java.util.Scanner;
public class Swap_without_temp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b: ");
int a=sc.nextInt();
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping:" + "\n" + "a = " + a + " b = " + b);
}
}