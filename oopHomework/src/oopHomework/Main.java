package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Students student1 = new Students(1,"Alkýn Bora","Uçak","alkinbora287@gmail.com");
		Students student2 = new Students(2,"Ege","Aytaç","egemel2000a@hotmail.com");
		Students student3 = new Students(3,"Emre","Baltacý","emre0697@gmail.com");
		Students student4 = new Students(4,"Yaðmur Dilara","Benli","y_dilara_b@hotmail.com");
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý", "Engin Demirog", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course2 = new Course(2, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demirog", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
		
		System.out.println("Sayýn " + student1.studentName + " Sitemize Hoþgeldiniz");
		System.out.println("Lütfen " + student1.studentEmail + " Mail Aderesinize Gönderdiðimiz Maili Doðrulayýnýz");
		System.out.println("-------------------------------------------");
		
		System.out.println("Kodlama.io sitesinde olan kurslar.");
		System.out.println("-------------------------------------------");
		

		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.lessonId);
			System.out.println("Kursun Adý: " + course.courseName);
			System.out.println("Eðitmen: " + course.courseInstructor);
			System.out.println("");
		}
		
		System.out.println("Kayýt olma istediðiniz kursu seçiniz.");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registerTheCourse(course1);
		courseManager.registerTheCourse(course2);
		System.out.println("-------------------------------------------");
		
		System.out.println("Kursa Kayýtlý Öðrencileri Görmek Ýçin Týklayýnýz");
		
		CourseManager courseManager2 = new CourseManager();
		
		courseManager2.registeredMember(student1);
		courseManager2.registeredMember(student2);
		courseManager2.registeredMember(student3);
		courseManager2.registeredMember(student4);
	}

}
