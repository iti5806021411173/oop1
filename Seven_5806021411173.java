import java.util.Scanner;
public class Seven_Dwarves {
public static void main(String[] args) {
// TODO Auto-generated method stub
int num1,num2,num3,num4,num5,num6,num7,num8,num9,sum;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Number 1 : ");
num1 = scan.nextInt();
System.out.print("Enter Number 2 : ");
num2 = scan.nextInt();
System.out.print("Enter Number 3 : ");
num3 = scan.nextInt();
System.out.print("Enter Number 4 : ");
num4 = scan.nextInt();
System.out.print("Enter Number 5 : ");
num5 = scan.nextInt();
System.out.print("Enter Number 6 : ");
num6 = scan.nextInt();
System.out.print("Enter Number 7 : ");
num7 = scan.nextInt();
System.out.print("Enter Number 8 : ");
num8 = scan.nextInt();
System.out.print("Enter Number 9 : ");
num9 = scan.nextInt();
sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
if(sum-(num9+num8)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7);
}else if(sum-(num9+num7)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num8);
}else if(sum-(num9+num6)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num7+"\n"
+num8);
}else if(sum-(num9+num5)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num6+"\n"
+num7+"\n"
+num8);
}else if(sum-(num9+num4)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8);
}else if(sum-(num9+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8);
}else if(sum-(num9+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8);
}else if(sum-(num9+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8);
}else if(sum-(num8+num7)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num9);
}else if(sum-(num8+num6)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num8+"\n"
+num9);
}else if(sum-(num8+num5)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num6+"\n"
+num7+"\n"
+num9);
}else if(sum-(num8+num4)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num9);
}else if(sum-(num8+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num9);
}else if(sum-(num8+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num9);
}else if(sum-(num8+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num9);
}else if(sum-(num7+num6)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num8+"\n"
+num9);
}else if(sum-(num7+num5)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num6+"\n"
+num8+"\n"
+num9);
}else if(sum-(num7+num4)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num5+"\n"
+num6+"\n"
+num8+"\n"
+num9);
}else if(sum-(num7+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num8+"\n"
+num9);
}else if(sum-(num7+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num8+"\n"
+num9);
}else if(sum-(num7+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num8+"\n"
+num9);
}else if(sum-(num6+num5)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num4+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num6+num4)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num5+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num6+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num4+"\n"
+num5+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num6+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num6+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num4+"\n"
+num5+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num5+num4)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num3+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num5+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num4+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num5+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num4+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num5+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num4+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num4+num3)==100){
System.out.println(num1+"\n"
+num2+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num4+num2)==100){
System.out.println(num1+"\n"
+num3+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num4+num1)==100){
System.out.println(num2+"\n"
+num3+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num3+num2)==100){
System.out.println(num1+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num3+num1)==100){
System.out.println(num2+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}else if(sum-(num2+num1)==100){
System.out.println(num3+"\n"
+num4+"\n"
+num5+"\n"
+num6+"\n"
+num7+"\n"
+num8+"\n"
+num9);
}
else{
System.out.println("Error");
}
}
}