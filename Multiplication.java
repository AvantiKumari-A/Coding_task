//Multiplication from 1 to 10

class Multiplication{
public static void main(String[] args){
for(int i=1;i<=10;i++){
System.out.println("\n" + "Multiplication table of " + i + " is:" + "\n");
for(int j=1;j<=10;j++){
System.out.println(i + " * " + j + " = " + (i*j) );
}
}
}
}