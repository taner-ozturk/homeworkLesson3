public class Instructor extends User {

    public Instructor(int id, String identityNumber, String name, String lastName, String email, String giveLesson) {
        super(id, identityNumber, name, lastName, email);
        this.setGiveLesson(giveLesson);
    }

    public Instructor() {
    }

    private String giveLesson;

    public String getGiveLesson() {
        return giveLesson;
    }

    public void setGiveLesson(String giveLesson) {
        this.giveLesson = giveLesson;
    }
}
