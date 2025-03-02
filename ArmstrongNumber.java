import java.util.Scanner;
public class ArmstrongNumber{
public static int Armstrong(int num){
int sum=0;
while(num>0){
int digit=num%10;
int cube=digit*digit*digit;
sum+=cube;
num=num/10;
}
return sum;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of number: ");
int n=sc.nextInt();
int temp=n,result;
result=Armstrong(n);
if(temp==result)
System.out.println(temp + " is a Armstrong Number.");
else
System.out.println(temp + " is not a Armstrong Number.");
sc.close();
}
}

