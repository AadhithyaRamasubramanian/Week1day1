package week1day1;

public class Fibonacci {
	public static void main(String[] args) {
    int firstnumber=0;
	int secondnumber=1;
	int sum = 0;
	System.out.println(firstnumber);
	System.out.println(secondnumber);
	for (int i=2; i<=10;i++)
	{
	sum = firstnumber + secondnumber;
	firstnumber=secondnumber;
	secondnumber=sum;
	System.out.println(sum);			
		}
	
}
}