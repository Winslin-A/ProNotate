
public class School {
	public static void main(String[] args) {
		
	      Student StudOne = new Student("Vinoth");
	      Student StudTwo = new Student("Joseph");
	      Student StudThree = new Student("Aldrin");

	     
	      StudOne.studAge(15);
	      StudOne.studplace("Nagercoil");
	      StudOne.studFees(40000);
	      StudOne.printStudent();

	      StudTwo.studAge(16);
	      StudTwo.studplace("Kanyakumari");
	      StudTwo.studFees(50000);
	      StudTwo.printStudent();
	      
	      StudThree.studAge(18);
	      StudTwo.studplace("Thuckalay");
	      StudTwo.studFees(30000);
	      StudTwo.printStudent();

	}
	static class Student {

		   String name;
		   int age;
		   String place;
		   double fees;

		   public Student(String name) {
		      this.name = name;
		   }

		   public void studAge(int studAge) {
		      age = studAge;
		   }

		   public void studplace(String studplace) {
			   place = studplace;
		   }

		   public void studFees(double studFees) {
			   fees = studFees;
		   }

		   public void printStudent() {
		      System.out.println("Name:"+ name );
		      System.out.println("Age:" + age );
		      System.out.println("Place:" + place );
		      System.out.println("Fees:" + fees);
		      System.out.println("\t");
		   }
		}

}
