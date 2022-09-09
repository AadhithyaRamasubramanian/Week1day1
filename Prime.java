package week1day1;
public class Prime {

	public static void main(String[] args) {
		int number =17;
boolean aPrime= true;

 for (int i=2;i<number;i++)
 {
	 if(number%i==0)
	 {	 
  System.out.println("notprime");
  aPrime= false; 
  break;
	 }
 }
 
if(aPrime==true) {
	 System.out.println("prime");
	 }
	}
}