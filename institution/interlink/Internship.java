package institution.interlink;
import java.util.ArrayList;
import person.Student;

public class Internship {
	private String name;
	private ArrayList <Student> studentsInternship = new ArrayList <Student> ();
    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
    	studentsInternship.add(student);
    }

    public ArrayList <Student> getStudents() {
        return studentsInternship;
    }
    
    public String getName () {
    	return name;
    }
  
}

  
