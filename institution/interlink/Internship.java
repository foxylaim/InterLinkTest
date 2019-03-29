
package institution.interlink;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> studentsList;

    public Internship(String name){
        this.name = name;
        studentsList = new LinkedList<Student>();
    }

    public void setStudent(Student student){
    	studentsList.add(student);
    }

    public void addIntern(List<Student> studentsList, int average){
        for (Student student : studentsList){
            if (student.getKnowledge().getKnowledgeLevel() > average){
                setStudent(student);
            }
        }
    }

    public String getStudents(){
        String result = new String();
        for (Student student : studentsList){
            result = result.concat(student.getName() +"  "+ student.getKnowledge().getKnowledgeLevel()+"\n");
        }
        return result;
    }
}