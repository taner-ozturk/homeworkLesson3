public class InstructorManager extends UserManager {
    public void AddLesson(Instructor instructor) {
        System.out.println("Lesson Added : "+instructor.getGiveLesson());
    }

    public void RemoveLesson(Instructor instructor) {

        System.out.println("Lesson Remove : "+instructor.getGiveLesson());
    }

    public void UpdateLesson(Instructor instructor) {

        System.out.println("Lesson Update : "+instructor.getGiveLesson());
    }
    public void addTeacher(Instructor instructor){
        System.out.println("Öğretmen eklendi : "+ instructor.getName());
    }
}
