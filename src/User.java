import java.util.Locale;

public class User {
    public User(int id,String email){
        System.out.println("Yapıcı blok çalıştı: ");
        this.id=id;
        this.email=email;
    }
    public User(){
    }

    private int id;
    private String email;
    private String otoNickName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtoNickName() {
        return this.id+email.toUpperCase(Locale.ROOT).substring(0,3);
    }
}
