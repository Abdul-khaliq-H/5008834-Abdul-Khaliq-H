package MVCPatternExample;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("John Doe", 1, "A");

        // Create a StudentView
        StudentView view = new StudentView();

        // Create a StudentController
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentId(2);
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}

// Output:

// Student: 
// Name: John Doe
// ID: 1
// Grade: A
// Student:
// Name: Jane Doe
// ID: 2
// Grade: B