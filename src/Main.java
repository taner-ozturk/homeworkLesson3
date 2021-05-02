public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("Taner");
        student.setLastName("ÖztÜRK");
        student.setEmail("taner1ozturk@gmail.com");
        student.setIdentityNumber("12121212121");
        student.setTakeLesson("java lesson 3");
        student.getOtoNickName();
        System.out.println(student.getOtoNickName()+student.getTakeLesson());

        Student student2 = new Student(3,"876876876","Emre","Durmaz","emredrmz@gmail.com","java lesson 2");
        System.out.println(student2.getOtoNickName()+" "+student2.getTakeLesson());

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setName("Engin");
        instructor.setLastName("DEMİROĞ");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setIdentityNumber("43243243243");
        instructor.setGiveLesson("Java");
        instructor.getOtoNickName();
        System.out.println(instructor.getOtoNickName());

        UserManager userManager = new UserManager();
        userManager.List();
        StudentManager studentManager= new StudentManager();
        studentManager.HomeworkAdd();
        studentManager.HomeworkRemove();
        studentManager.HomeworkUpdate();
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.AddLesson(instructor);
        instructorManager.RemoveLesson(instructor);
        instructorManager.UpdateLesson(instructor);
        instructorManager.addTeacher(instructor);
    }

}
