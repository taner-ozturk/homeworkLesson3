public class Student extends User {

    private String takeLesson;
    private String identityNumber;
    private String name;
    private String lastName;

    public Student() {
    }

    public Student(int id, String identityNumber, String name, String lastName, String email, String takeLesson) {
        super(id, email);
        this.takeLesson = takeLesson;
        this.identityNumber = identityNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public String getIdentityNumber() {

        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getTakeLesson() {

        return takeLesson;
    }

    public void setTakeLesson(String takeLesson) {
        this.takeLesson = takeLesson;
    }
}
