import java.util.*;
import com.company.Student;

public class Group {

    private String groupOfNumber;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public Group(String groupOfNumber) {

        this.groupOfNumber = groupOfNumber;
    }

    // Создаем словарь, где ключ - возраст студент, значение - количество студентов
    public Map<Integer, Integer> getCountByAge(){
        Map<Integer, Integer> map = new HashMap<>();
        for (Student student : studentsList) {
            if (!map.containsKey(student.getAge())) {
                map.put(student.getAge(), 1);
            }
            else {
                int count = map.get(student.getAge());
                map.put(student.getAge(), count+1);
            }

        }
        return map;
    }

    public void addStudent(Student newStudent) {

        studentsList.add(newStudent);
    }
    public List<Student> getAll(){
        return studentsList;

    }

    public List<Student> getByMinScore(double rating){
        ArrayList<Student> ratingStudents = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getAverageScore() >= rating) {
                ratingStudents.add(student);
            }
        }
        return ratingStudents;
    }

    public Student getByNumber(int numberBook) {
        for (Student student : studentsList) {
            if (student.getNumber() == numberBook) {
                return student;
            }
        }
        return new Student();
    }

    public void deleteStudent(Student student){

        for (Student student : studentsList) {
            if (student == student) {
                studentsList.remove(student);
                break;
            }
        }
    }


    public void printInfo(){
        for (Student student : studentsList) {
            student.printInfo(student);
        }
    }
}
