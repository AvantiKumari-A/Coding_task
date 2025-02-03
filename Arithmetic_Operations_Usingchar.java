import java.util.Scanner;
public class Arithmetic_Operations_Usingchar{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a = sc.nextInt();
System.out.println("Enter the value of b: ");
int b = sc.nextInt();
System.out.println("The available options are: \n" + "'a' for Addition\n" + "'s' for Subtraction\n" + "'m' for multiplication\n" + "'d' for Division\n" + "'u' for Modulus\n");
System.out.println("Enter any one of the option (in char): ");
char choice = sc.next().charAt(0);
sc.close();
switch(Character.toLowerCase(choice)){
case 'a':
System.out.println(a + " + " + b + " = " + (a+b));
break;
case 's':
if(b>a){
System.out.println(b + " - " + a + " = " + (b-a));
}
else{
System.out.println(a + " - " + b + " = " + (a-b));
}
break;
case 'm':
System.out.println(a + " * " + b + " = " + (a*b));
break;
case 'd':
if(b==0){
System.out.println("Error: Division by zero is not allowed");
}
else{
System.out.println(a + " / " + b + " = " + (a/b));
}
break;
case 'u':
if(b==0){
System.out.println("Error: Modulus by zero is not allowed");
}
else{
System.out.println(a + " % " + b + " = " + (a%b));
}
break;
default:
System.out.println("Invalid Value!! Enter the correct operation form the given options..");
break;
}
}
} 