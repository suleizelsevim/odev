package odev;

public class Main {

	public static void main(String[] args) {
		 Courses cours1=new Courses(1, "C#+Angular", "Engin Demiroğ");
		 Courses cours2=new Courses(2,"Java+React","Engin Demiroğ");
		 
		 Courses[] cours= {cours1,cours2};
		 
		 for(Courses courses:cours) {
			 System.out.println(courses.name + " " + courses.educator);
		 }
		 
		 CourseManager manager=new CourseManager();
		 manager.join(cours1);
		 manager.join(cours2);

	}

}
