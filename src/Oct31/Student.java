package Oct31;

import java.util.Calendar;
import java.util.Date;

public class Student implements Cloneable {

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setYear_level(int year_level) {
        this.year_level = year_level;
        return this;
    }

    public Student setProgram(String program) {
        this.program = program;
        return this;
    }

    public Student setCourses(String[] courses) {
        this.courses = courses;
        return this;
    }

    public Student setGrades(double[] grades) {
        this.grades = grades;
        return this;
    }

    public Student setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    String name;
    int id;
    int year_level;
    String program;
    String[] courses;
    double[] grades;
    Date birthday;

    Student() {}


    public static void main(String[] args) {
        Student s = new Student().setName("Vince").setId(1767).setBirthday(new Date(2020, Calendar.OCTOBER, 31)).setGrades( new double[] {1.2, 5.0} );
        System.out.println(s.name);
        Student s2 = s.clone();
        s2.grades[0] = 4.9;
        System.out.println(s2.grades[0]);
        System.out.println(s.grades[0]);
        s2.name = "Jay";
        System.out.println(s2.name);
        System.out.println(s.name);
        s2.id = 1777;
        System.out.println(s2.id);
        System.out.println(s.id);
        System.out.println(s2.birthday.getMonth());
        s2.birthday.setMonth(Calendar.APRIL);
        System.out.println(s2.birthday.getMonth());
        System.out.println(s.birthday.getMonth());

    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.birthday = (Date) birthday.clone();
            clone.grades = grades.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
