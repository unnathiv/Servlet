import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int a=0;
	    int b=s.length()-1;
	    while(b>a) {
	    	char c=s.charAt(b);
	    	b--;
	    	char d=s.charAt(a);
	    	a++;
	    
	    if(c==d) {
	    	System.out.println("Strimg is Palindrome");}
	    
	    else
	    {System.out.println("String is not palindrome");}
	    
	    }}
	}

