package person;

import person.consciousness.Knowledge;
import institution.University;


public class Student {	
	private String name;
	private Knowledge knowledge;
	University university;
	 public Student(String name) {
        this.name = name;
    }
	public void setKnowledge(Knowledge knowledge) {
	    	this.knowledge = knowledge;
	    }
	    
     public Knowledge getStudentKnowledge () {
	    	return knowledge;
	    }
	    
	 public String getName () {
	    	return name;
	    }
}
