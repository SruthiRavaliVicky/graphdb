public class Main {
    public static void main(String[] args) {
        // Create some courses
        Course javaCourse = new Course("Introduction to Java", "CS101", 3);
        Course dataStructures = new Course("Data Structures", "CS102", 4);
        Course databases = new Course("Database Management Systems", "CS103", 3);

        // Create a student
        Student student1 = new Student("John Doe", "S12345");

        // Enroll the student in courses
        Enrollment.enrollStudentInCourse(student1, javaCourse);
        Enrollment.enrollStudentInCourse(student1, dataStructures);

        // Display student details
        student1.displayStudentDetails();
        
        // Enroll in another course
        Enrollment.enrollStudentInCourse(student1, databases);

        // Display student details after adding more courses
        System.out.println("\nAfter enrolling in another course:");
        student1.displayStudentDetails();
    }
}
