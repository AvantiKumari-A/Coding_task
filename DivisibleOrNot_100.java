import java.util.Scanner;
public class DivisibleOrNot_100{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to check if it is divisible by 100 or not: ");
int num=sc.nextInt();
sc.close();
if(num%100==0){
System.out.println("The given number " + num + " is divisible by 100 ");
}
else{
System.out.println("The given number " + num  + " is not divisible by 100 ");
}
}
}