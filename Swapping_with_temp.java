//Swap numbers by using third variable

import java.util.Scanner;
public class Swapping_with_temp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b: ");
int a=sc.nextInt();
int b=sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("After Swapping:" + "\n" + "a = " + a + " b = " + b);
}
}