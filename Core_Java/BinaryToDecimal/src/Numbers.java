import java.util.Scanner;

public class Numbers {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary number");
	int n=sc.nextInt();
	int number=0,i=0;
	while(n!=0) {
	number+=((n%10)+Math.pow(2, i));
	n=n/10;
	i++;
	}
	System.out.println(+number);
	}
	
//int x,i;
//public Numbers() {
////	this.n=n;
//}
  //{	
//    for(i=0;i<n;i++)
//{
//	n=n/10;
//	if (n==0) 
//	{
//		int x= (int) Math.pow(2,0);
//	 }
//	else 
//		x=(int) (x+Math.pow(2,1));
//    }
//	return x;
//  }
}


