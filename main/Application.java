package main;
import java.util.ArrayList;
import java.util.List;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application   {
	
	
    public static void main(String[] args) {
    	
    	University university = new University("NULP");
        university.addStudent(new Student("Dark Kris", new Knowledge(5)));
        university.addStudent(new Student("Vermont Bueno", new Knowledge(8)));
        university.addStudent(new Student("Mary Thompson", new Knowledge(11)));
        university.addStudent(new Student("Rosa Clark", new Knowledge(6)));


        

        Internship internship = new Internship("InterLink");
        internship.addIntern(university.getListStudents(), university.getAverage());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }

    	
    
    }

