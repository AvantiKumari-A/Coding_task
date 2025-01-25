// Display Weekday name from the input as int

import java.util.Scanner;
class Week_day{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number(1-7): ");
int day=sc.nextInt();
sc.close();
switch(day){
case 1:
System.out.println("Today is Monady");
break;
case 2:
System.out.println("Today is Tuesday");
break;
case 3:
System.out.println("Today is Wednesday");
break;
case 4:
System.out.println("Today is Thursday");
break;
case 5:
System.out.println("Today is Friday");
break;
case 6:
System.out.println("Today is Saturday");
break;
case 7:
System.out.println("Today is Sunday");
break;
default:
System.out.println("Oops!! Enter the correct number");
break;
}
}
}

