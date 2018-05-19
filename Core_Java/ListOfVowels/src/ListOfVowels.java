import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class ListOfVowels {
public static void main(String[] args) throws IOException {
	    // TODO code application logic here
	    System.out.println("Enter some text");
	    Scanner sc=new Scanner(System.in);
	    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = sc.nextLine().toLowerCase();

	    char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'};
	    int[] countVowel = new int[5];
	    for (int j = 0; j < input.length(); j++) {
	        char c =input.charAt(j);
	        if(c=='a')
	            countVowel[0]++;
	        else if(c=='e')
	            countVowel[1]++;
	        else if(c=='i')
	            countVowel[2]++;
	        else if(c=='o')
	            countVowel[3]++;
	        else if(c=='u')
	            countVowel[4]++;
}
	     for (int i = 0; i <countVowel.length; i++) {
	            System.out.println("Count of vowel " + vowel[i] + "=" + countVowel[i]);
	        }

	    }
	}

//HashSet<String> h=new HashSet<String>();
//h.add("a");h.add("e");h.add("i");h.add("o");h.add("u");
//System.out.println("List of vowels:"+h);
//System.out.println("Enter a letter consists of vowels:");
//Scanner sc=new Scanner(System.in);
//{
//for(int i=0;i<sc.length();i++) {
//	char s=sc.charAt(i);
//if(s=='a'){
//	int count=+1;
//	System.out.println("occurences of a" +count);
//}
//else if(s=='e'){
//	int count1=+1;
//	System.out.println("occurences of e"+count1);
//}else if(s=='i') {
//	int count2=+1;
//	System.out.println("occurences of i"+count2);
//}else if(s=='o') {
//	int count3=+1;
//	System.out.println("occurences of o"+count3);
//}else if
// (s=='u') {
//	int count4=+1;
//	System.out.println("occurences of u"+count4);
//}	
//    }
//}}	}
//	

