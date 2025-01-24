//Even or odd
import java.util.Scanner;
class Even_Odd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
sc.close();
if(n%2==0){
System.out.println(n + " is even");
}
else{
System.out.println(n + " is odd");
}
}
}