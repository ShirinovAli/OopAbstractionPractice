package oopAbstractionPractice;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ali");
		student.setLastName("Shirinov");
		student.setEmail("ali@ali.com");
		student.setStudentNumber("039");
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engin@engin.com");
		instructor.setCourses(new String[] {"C# + Angular", "JAVA + React"});
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addNewCourse("C# + Angular");
		
		StudentManager studentManager = new StudentManager();
		studentManager.attendCourse("Java + React");
	}

}
