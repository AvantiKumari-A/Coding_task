//Find greatest among three numbers (a,b,c)

import java.util.Scanner;
class Greatest_number{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
sc.close();
if(a>b && a>c)
{
System.out.println("A is the greatest number");
}
else if(b>a && b>c){
System.out.println("B is greatest number");
}
else{
System.out.println("C is greatest number");
}
}
}
