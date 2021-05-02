public class Instructor extends User {

    public Instructor(int id, String identityNumber, String name, String lastName, String email, String giveLesson) {
        super(id, email);
        this.giveLesson=giveLesson;
        this.identityNumber = identityNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public Instructor() {
    }

    private String giveLesson;
    private String identityNumber;
    private String name;
    private String lastName;

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


    public String getGiveLesson() {
        return giveLesson;
    }

    public void setGiveLesson(String giveLesson) {
        this.giveLesson = giveLesson;
    }
}
