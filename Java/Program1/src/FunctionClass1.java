import java.util.Scanner;

public class FunctionClass1 {

	public static void main(String[] args) {
		fun Obj = new fun();
		Obj.add();

	}
	static class fun
	{
		private int a,b;
		public void add()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("\n Enter the value of A \n");
			a = in.nextInt();
			System.out.print("\n Enter the value of B \n");
			b = in.nextInt();
			System.out.print("\n Sum:"+ (a+b));
		}
	}

}
