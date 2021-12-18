package programowanie2;

public class GradesTest {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(1);
        grades.add(5);
        grades.add(5);
        grades.add(1);
        grades.add(5);
        grades.add(5);
        grades.add(5);
        grades.add(4);//nie działa dodanie 11 elementu do tabeli
        System.out.println(grades.lastAddedGrade());
        System.out.println(grades.averageGrade());
    }
}
