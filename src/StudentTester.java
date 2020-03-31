
public class StudentTester {

	public static void main(String[] args) {
		StudentInfo S1 = new StudentInfo("bob", "smith", "j", 10, 20, 2000);
		StudentInfo S2 = new StudentInfo("john", "tom", "s", 07, 30, 2001);
		String S1_FullName = S1.getFullName();
		String S2_FullName = S2.getFullName();
		
		int S1_age = S1.age();
		int S2_age = S2.age();
		
		System.out.println(S1_FullName + " is " + S1_age + " years old. ");
		System.out.println(S2_FullName + " is " + S2_age + " years old. ");
		
		System.out.println(" elapsed days: " + S1.elapsedDays(2010, 10, 10));
		System.out.println(" elapsed days: " + S2.elapsedDays(2008, 06, 21));
	}

}
