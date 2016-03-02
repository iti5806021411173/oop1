import java.util.Scanner;
public class Encode {
	
	public static void main(String[] args) {
		
	String a1,a2;
	char c1;
	int i=0;
	
	Scanner out= new Scanner(System.in);
	System.out.print("Enter text : ");
	a1=out.nextLine();
	a2=a1.toUpperCase();
	
	for(i=a2.length()-1;i>=0;i--)
	{
		c1=a2.charAt(i);
		
		if(c1=='R'){
			c1='E';
		}
		else if(c1=='W'){
			c1='R';
		}
		else if(c1=='E'){
			c1='W';
		}
		System.out.print(c1);
	}
  }
}