public class Student extends User {

    public Student(int id, String identityNumber, String name, String lastName, String email, String takeLesson) {
        super(id, identityNumber, name, lastName, email);
        this.takeLesson = takeLesson;
    }

    public Student() {
    }

    private String takeLesson;

    public String getTakeLesson() {
        return takeLesson;
    }

    public void setTakeLesson(String takeLesson) {
        this.takeLesson = takeLesson;
    }
}
