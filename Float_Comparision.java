//Compare float upto 3 decimals

import java.util.Scanner;
class Float_Comparision{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two values of float: ");
float a=sc.nextFloat();
float b=sc.nextFloat();
sc.close();
a=Math.round(a*1000)/1000;
b=Math.round(b*1000)/1000;
if(a==b){
System.out.println("The value of " + a + " and the value of " + b + " is equal upto 3 decimals");
}
else{
System.out.println("The value of " + a + " and the value of " + b + " is not equal upto 3 decimals");
}
}
}

