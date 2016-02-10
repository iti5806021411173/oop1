package asd;

import java.util.Scanner;


public class ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int left=1,center=0,right=0,temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		temp=left;
		left=center;
		center=temp;
		}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		temp=center;
		center=right;
		right=temp;
		}else{
		temp=left;
		left=right;
		right=temp;
		}
		}
		if(left == 1) System.out.println("Coin is in Left glass");
		else if(center == 1) System.out.println("Coin is in Center glass");
		else System.out.println("Coin is in Right glass");
	}

}
