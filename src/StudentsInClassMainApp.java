import java.util.ArrayList;
import java.util.Scanner;
 
/**
 * @author melanie.williamson
 *
 */

public class StudentsInClassMainApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Kyan", 7, 2));
		students.add(new Student("Tiffany", 18, 12));
		students.add(new Student("Saisha", 16, 11));
		students.add(new Student("Thomas", 13, 8));
		students.add(new Student("Rodney", 5, 1));
		students.add(new Student("Peyton", 11, 6));
		System.out.println(students);
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome to our Java class. "
				+ "Which student would you like to learn more about? (enter a number 1-6)");
		String studentName = myObj.nextLine();
		
		for (Student student : students) { 
			if (student.getName().contains(studentName)) {
				System.out.println("Student is " + studentName + ". What would like to know about him or her? (age/grade): ");	
				String more = myObj.next();
				if (more.equalsIgnoreCase("age")) {
					System.out.println(student.getAge());
				} else {
					System.out.println(student.getGrade());
				}
			}
			
			else {
				System.out.println("");
			}
		}
			
	}

}
