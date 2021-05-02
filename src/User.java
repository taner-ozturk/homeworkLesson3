import java.util.Locale;

public class User {
    public User(int id,String identityNumber,String name,String lastName,String email){
        System.out.println("Yapıcı blok çalıştı: ");
        this.id=id;
        this.identityNumber=identityNumber;
        this.name=name;
        this.lastName=lastName;
        this.email=email;


    }
    public User(){

    }

    private int id;
    private String identityNumber;
    private String name;
    private String lastName;
    private String email;
    private String otoNickName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtoNickName() {
        return this.identityNumber.substring(0,3)+lastName.toUpperCase(Locale.ROOT).substring(0,3);
    }
}
