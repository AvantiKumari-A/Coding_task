/* Program to check prime or not
Prime number is a number which is divisble by 1,itself (2 factors only) */

import java.util.Scanner;
public class PrimeOrNot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println(n + " is a prime number");
}
else{
System.out.println(n + " is not a prime number");
}
}
}

