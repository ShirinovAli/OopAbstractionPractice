package oopAbstractionPractice;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("User added successfully : " + user.getFirstName() + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("User updated successfully");
	}
	
	public void delete(User user) {
		System.out.println("User deleted successfully");
	}
	
	public void attendCourse(String course) {
		System.out.println("You attended the course successfully");
	}
}
