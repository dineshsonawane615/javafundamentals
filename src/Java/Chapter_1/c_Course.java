package Java.Chapter_1;

public class c_Course {

    static int maxCapacity;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    c_Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        c_Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName) {
        enrolledStudents[enrollments] = studentName;
        System.out.println(studentName + " has been enrolled.");
        enrollments++;
    }

    void unenrollStudents(String studentName) {
        System.out.println("Student removed");
        System.out.println(studentName + " has been removed.");
        enrollments--;
    }

    public static void main(String[] args) {

        c_Course.setMaxCapacity(5);
        c_Course javaCourse = new c_Course("java");
        javaCourse.enrollStudents("Alice");
        javaCourse.enrollStudents("Bob");
        javaCourse.enrollStudents("Charlie");
        javaCourse.enrollStudents("David"); // should say full
        javaCourse.unenrollStudents("John");


    }
}
