package swaping;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n,s=0,c,r;
		int num,reversednum=0,remainder;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrom number");
		}
	}

}
;
