//To find largest digit in a number

import java.util.Scanner;
class Largest_digit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int a=sc.nextInt();
sc.close();
int n,large=0;
while(a>0){
n=a%10;
if(n>large){
large=n;
}
a=a/10;
}
System.out.println("The largest digit in the given number is: " + large);
}
}
