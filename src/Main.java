import com.company.Student;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        Group group1 = new Group("704");
        Student student1 = new Student(76, "Anton", "Kabaev", 21, 3.8 );
        Student student2 = new Student(45, "Student2", "Surname2", 19, 4.8);
        Student student3 = new Student(18, "Stident3", "Surname3", 19, 3.5);
        Student student4 = new Student(45, "Student4", "Surname4", 20, 4.2);

        student1.printInfo(student1);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(new Student(65, "STuud_5", "Surname_ntw", 21, 3.56));

        List<Student> allStudents = group1.getAll();

        System.out.println(allStudents);

        Student studenN = group1.getByNumber(12);
        studenN.printInfo(studenN);
        group1.deleteStudent(student3);

        System.out.println(group1.getAll());

        List<Student> studentsRating = group1.getByMinScore(4.8);
        System.out.println(studentsRating);

        group1.printInfo();

        Map<Integer, Integer> map = group1.getCountByAge();
        System.out.println(map);

        //В отдельном классе, в методе main необходимо добавить несколько студентов методом addStudent с повторяющимися
        //возрастами и уникальными номерами зачетных книжек. Далее вызвать остальные методы в произвольной
        //последовательности с выводом результатов в консоль (для этого использовать методы printInfo классов Student и Group)
    }
}
