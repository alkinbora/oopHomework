package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Students student1 = new Students(1,"Alk�n Bora","U�ak","alkinbora287@gmail.com");
		Students student2 = new Students(2,"Ege","Ayta�","egemel2000a@hotmail.com");
		Students student3 = new Students(3,"Emre","Baltac�","emre0697@gmail.com");
		Students student4 = new Students(4,"Ya�mur Dilara","Benli","y_dilara_b@hotmail.com");
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�", "Engin Demirog", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course2 = new Course(2, "Programlamaya Giri� ��in Temel Kurs", "Engin Demirog", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
		
		System.out.println("Say�n " + student1.studentName + " Sitemize Ho�geldiniz");
		System.out.println("L�tfen " + student1.studentEmail + " Mail Aderesinize G�nderdi�imiz Maili Do�rulay�n�z");
		System.out.println("-------------------------------------------");
		
		System.out.println("Kodlama.io sitesinde olan kurslar.");
		System.out.println("-------------------------------------------");
		

		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.lessonId);
			System.out.println("Kursun Ad�: " + course.courseName);
			System.out.println("E�itmen: " + course.courseInstructor);
			System.out.println("");
		}
		
		System.out.println("Kay�t olma istedi�iniz kursu se�iniz.");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registerTheCourse(course1);
		courseManager.registerTheCourse(course2);
		System.out.println("-------------------------------------------");
		
		System.out.println("Kursa Kay�tl� ��rencileri G�rmek ��in T�klay�n�z");
		
		CourseManager courseManager2 = new CourseManager();
		
		courseManager2.registeredMember(student1);
		courseManager2.registeredMember(student2);
		courseManager2.registeredMember(student3);
		courseManager2.registeredMember(student4);
	}

}
