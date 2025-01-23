/* Write a java program considering months ( 1 to 12).
For months:
March to May - Print "Spring Season"
June to August - Print "Summer Season"
September to November - Print "Autumn Season"
December to February - Print "Winter Season"
If month is less than 1 or greater than 12 - Print "Invalid Month Entered!" */

import java.util.Scanner;
public class Season{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the month (in int): ");
int n=sc.nextInt();
sc.close();
if(n>=3 && n<=5){
System.out.println("Spring Season");
}
else if(n>=6 && n<=8){
System.out.println("Spring Season");
}
else if(n>=12 && n<=13){
System.out.println("Winter Season");
}
else{
System.out.println("Invalid Month Entered! Enter from 1 to 12 months..");
}
}
}

