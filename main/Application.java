package main;
import java.util.ArrayList;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
	private static ArrayList <University> universities = new ArrayList <University> ();
	private static ArrayList <Internship> internships = new ArrayList <Internship> ();
	static University university;
	static Internship internship;
	static Student student;
	static Knowledge knowledge;
	
    public static void main(String[] args) {
    	university = new University("CH.U.I.");
    	student = new Student("Andrew Kostenko");
        knowledge = new Knowledge (6);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	universities.add(university); 
    	
        student = new Student("Julia Veselkina");
        knowledge = new Knowledge (8);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	
    	university = new University("LSNU");
    	
    	student = new Student("Arnold Seul");
        knowledge = new Knowledge (5);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	
    	student = new Student("Ihor Zamishchak");
        knowledge = new Knowledge (7);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	universities.add(university);
    	
    	   	
    	for (University univer: universities) {
    		internship = new Internship (univer.getName()); 
    		for (Student students: univer.getStudents()) {
    			if (students.getStudentKnowledge().getKnowledge() > 5 ) {
    				internship.setStudent(students);
    			}
    		}
    		internships.add(internship);
    	}
    	
    	System.out.println("List of internship's students:\n");
    	
   	for (Internship intern: internships) {
    		System.out.print(intern.getName() + ":\n"); 
    		for (Student students: intern.getStudents()) 
    			System.out.println(students.getName() + " -> " + students.getStudentKnowledge().getKnowledge());
    		
    	
    	}
    }
}
