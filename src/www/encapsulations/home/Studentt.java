package www.encapsulations.home;

public class Studentt {

	private int roll_number;
	private String name;
	private boolean isAttended;
	private int usn;

	// ✅ Constructor with parameters
	public Studentt(int roll_number, String name) {
		this.roll_number = roll_number;
		this.name = name;
	}

	// Getters and Setters
	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAttended() {
		System.out.println("Teacher checked the student's attendance.");
		return isAttended;
	}

	public void setAttended(boolean isAttended) {
		System.out.println("Teacher marked the student's attendance.");
		this.isAttended = isAttended;
	}
	
	public int get_usn() {
		System.out.println("Teacher checked the student's usn");
		return usn;
	}
	
	
}
