package www.encapsulations.home;

public class Teacherss {

	public static void main(String[] args) {
		
		// Create a Student object
				Studentt s = new Studentt(101, "John");

				// Set and get attendance using encapsulated methods
				s.setAttended(true);

				// Print student details
				System.out.println("Student Name: " + s.getName());
				System.out.println("Roll Number: " + s.getRoll_number());
				System.out.println("Attendance: " + (s.isAttended() ? "Present" : "Absent"));
				System.out.println(s.get_usn());
				
		
		
	

	}

}
