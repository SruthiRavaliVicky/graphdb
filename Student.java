public class Student {
    private String studentId;
    private String name;
    
    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Method to enroll in a course
    public Enrollment enrollInCourse(Course course) {
        return new Enrollment(this, course);
    }
}
