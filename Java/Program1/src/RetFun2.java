import java.util.Scanner;

public class RetFun2 {

	public static void main(String[] args) {
		  int a,b,c;
	      c = minFunction(a, b);
	      System.out.println("Minimum Value = " + c);
	    
	}
	
public static int minFunction(int n1, int n2) {
    int min;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first value");
    n1 = in.nextInt();
    System.out.print("Enter the second value");
    n2 = in.nextInt();
    if (n1 > n2)
       min = n2;
    else
       min = n1;

    return min; 
 }
}