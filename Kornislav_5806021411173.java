import java.util.Scanner;

public class Kornislav_5806021411092 {

	public static void main(String[] args) {
			
		int l=1,c=0,r=0,lap;
			
			Scanner sc = new Scanner(System.in);
			
			String word;
			
			do{
				System.out.print("Enter Your Way : ");
				word = sc.nextLine();
				sc.close();
			
			}while(word.length() < 1 || word.length()>50 || word.length()==0 || (word.charAt(0)!='A' && word.charAt(0)!='B'&& word.charAt(0)!='C'&& word.charAt(0)!='a' && word.charAt(0)!='b' && word.charAt(0)!='c'));
			
			for(int i=0;i<word.length();i++){
			
				if(word.charAt(i)=='A'||word.charAt(i)=='a'){
					lap=l;
					l=c;
					c=lap;
					}
				else if(word.charAt(i)=='B'||word.charAt(i)=='b'){
					lap=c;
					c=r;
					r=lap;
					}
				else{
					lap=l;
					l=r;
					r=lap;
					}
				}
			System.out.println("L = "+l);
			System.out.println("C = "+c);
			System.out.println("R = "+r);
			
		}
	}


