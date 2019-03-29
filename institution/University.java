package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Student> studentsList;

    public University(String name) {
        this.name = name;
        studentsList = new LinkedList<Student>();
    }

    public void addStudent(Student student){
    	studentsList.add(student);
    }

    public void addStudents(List<Student> listStudents){
        this.studentsList.addAll(listStudents);
    }

    public List<Student> getListStudents(){
        return studentsList;
    }

    public void setListStudents(List<Student> studentsList){
        this.studentsList = studentsList;
    }

    public int getAverage(){        

        int average = 0;
        for (Student student : studentsList){
            average += student.getKnowledge().getKnowledgeLevel();
        }
        average = average / studentsList.size();
        return  average;
    }
}