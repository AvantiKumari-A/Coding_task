import java.util.Scanner;
public class DivisibleOrNot_27{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to check if it is divisible by 100 or not: ");
int num=sc.nextInt();
sc.close();
if(num%27==0){
System.out.println("The given number " + num + " is divisible by 27 ");
}
else{
System.out.println("The given number " + num  + " is not divisible by 27 ");
}
}
}