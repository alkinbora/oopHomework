package oopHomework;

public class CourseManager {
	
	public void registerTheCourse(Course course) {
		
		System.out.println(course.courseName + " Kursana Başarıyla Kayıt Olundu.");
		
	}
	
	public void registeredMember(Students students) {
		
		System.out.println("Kursa Kayıtlı Öğrenciler");
		System.out.println(students.studentId + " " + students.studentName + " " + students.studentSurname);
		
	}

}
