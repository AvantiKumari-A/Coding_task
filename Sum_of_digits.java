//To count the sum of digits in an integer using while loop

import java.util.Scanner;
class Sum_of_digits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int a=sc.nextInt();
int sum=0;

//If a is greater than 0
while(a>0){
sum+=a%10;
a=a/10;
}
System.out.println("Sum of digits in an integer is: " + sum);
}
}

/*First, a = 123, sum = 0

First iteration
(sum+ = a % 10) = 0 + (123 % 10) = 0 +  3(remainder)
sum = 3
(a = a / 10) = 123/10 = 12(quotient)
a = 12
Second iteration
(sum+ = a % 10) = 3 + (12 % 10) = 3 +  2(remainder)
sum = 5
(a = a / 10) = 12/10 = 1(quotient)
a = 1
Third iteration
(sum+ = a % 10) = 5 + (1 % 10) = 5 +  1(remainder)
sum = 6
(a = a / 10) = 1/10 = 0(quotient)
a = 0

Output: Sum of digits in an integer is: 6 */