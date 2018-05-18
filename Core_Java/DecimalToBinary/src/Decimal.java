
public class Decimal {
public static void decimalmethod(int n) {
	int[] a=new int[100];
	int i=0;
	while(n>0) {
		a[i]=n%2;
		n=n/2;
		i++;
	}
	for(int j=i-1;j>0;j--) {
	System.out.println(a[j]);
  }}
public static void main(String args[]) {
	int n=4;
	decimalmethod(n);
}
}
