package oopHomework;

public class CourseManager {
	
	public void registerTheCourse(Course course) {
		
		System.out.println(course.courseName + " Kursana Ba�ar�yla Kay�t Olundu.");
		
	}
	
	public void registeredMember(Students students) {
		
		System.out.println("Kursa Kay�tl� ��renciler");
		System.out.println(students.studentId + " " + students.studentName + " " + students.studentSurname);
		
	}

}
