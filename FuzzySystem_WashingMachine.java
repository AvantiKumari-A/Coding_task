import java.util.Scanner;
public class FuzzySystem_WashingMachine{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of weight (in grams): ");
int weight=sc.nextInt();
System.out.println("Enter the level of water Low(L), Medium(M), or High(H) (in char uppercase): ");
char level=sc.next().charAt(0);
sc.close();
if(weight<0){
System.out.println("INVALID INPUT");
}
else if(weight==0){
System.out.println("Time Estimated: 0 minutes");
}
else if((weight>0 && weight<=2000) && (level=='L')){
System.out.println("Time Estimated: 25 minutes");
}
else if((weight>2000 && weight<=4000) && (level=='M')){
System.out.println("Time Estimated: 35 minutes");
}
else if((weight>4000 && weight<=7000) && (level=='H')){
System.out.println("Time Estimated: 45 minutes");
}
else if(weight>7000){
System.out.println("OVERLOADED");
}
else{
System.out.println("INVALID INPUT");
}
}
}