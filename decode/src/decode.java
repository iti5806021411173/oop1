import java.util.Scanner;
public class decode {
public static void main(String[] args) {
		
		String a1,a2;
		char c;
		int i=0;
		
		Scanner out = new Scanner(System.in);
		System.out.print("Enter text : ");
		a1=out.nextLine();
		a2=a1.toUpperCase();
		
		for(i=a2.length()-1;i>=0;i--)
		{
			c=a2.charAt(i);
			
			if(c=='E'){
				c='R';
			}
			else if(c=='R'){
				c='W';
			}
			else if(c=='W'){
				c='E';
			}
			System.out.print(c);
		}
	}
}