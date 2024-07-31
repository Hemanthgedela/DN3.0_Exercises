public class Main 
{
    public static void main(String[] args) {
   
        Student student = new Student("1", "Amaya", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Aashika");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
