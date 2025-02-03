import java.util.Scanner;
public class Add_Sub{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt();
System.out.println("Enter the value of b: ");
int b=sc.nextInt();
sc.close();
int add=a+b;
int sub=a-b;
if(sub<0)
{
sub=-sub;
}
System.out.println("The Addition of " + a + " and " + b + " is: " + add);
System.out.println("The Subtraction of " + a + " and " + b + " is: " + sub);
}
}

