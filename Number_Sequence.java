import java.util.Scanner;
public class Number_Sequence{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=sc.nextInt();
sc.close();
System.out.println( "\n" + "The sequence of numbers from 1 to n is:");
for(int i=1;i<=n;i++){
if(i==n){
System.out.println(i);
}
else{
System.out.print(i + ", ");
}
}
}
}
