package institution;
import java.util.ArrayList;

import person.Student;

public class University {
	
 private String name;
 private Student student;
 private ArrayList <Student> students = new ArrayList <Student> ();	
    public University(String name) {
       this.name=name;
    }
    public void setStudent(Student student) {
    	this.student = student;
    }

    public void addStudent(Student student) {
    	students.add(student);
    }
    
    public String getName () {
    	return name;
    }
    
    public ArrayList<Student> getStudents () {
    	return students;
    }
    
    public Student getStudent () {
    	return student;
    }

   
    }

