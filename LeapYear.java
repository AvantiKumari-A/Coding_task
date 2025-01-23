/* Program to check whether the given year is Leap year or not 
Logic-> ( (n%4==0 && n%100!=0) || (n%400==0)) */

import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year: ");
int year=sc.nextInt();
sc.close();
if((year%4==0 && year%100!=0) || (year%400==0)){
System.out.println("The given year " + year + " is a leap year");
}
else{
System.out.println("The given year " + year + " is not a leap year");
}
}
}