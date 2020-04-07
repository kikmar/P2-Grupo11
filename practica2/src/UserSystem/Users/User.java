package UserSystem.Users;


public class User {
    private String Name;
    private String Surname1;
    private String Surname2;
    private String Nick;
    private String Email;
    private String Pasword;
    private boolean Admin; 
    private boolean IsStudent;
    private boolean  IsConected;
  //private Penalizacion Penalizado; fata crear clase Penalización
  //private ListaSuscripciones ListaSubforos falta crear clase ListaSuscripciones

    public User(String Name, String Surname1, String Surname2, String Nick, String Email, String Pasword, boolean Admin, boolean IsStudent) {
        this.Name = Name;
        this.Surname1 = Surname1;
        this.Surname2 = Surname2;
        this.Nick = Nick;
        this.Email = Email;
        this.Pasword = Pasword;
        this.Admin = Admin;
        this.IsStudent = IsStudent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname1() {
        return Surname1;
    }

    public void setSurname1(String Surname1) {
        this.Surname1 = Surname1;
    }

    public String getSurname2() {
        return Surname2;
    }

    public void setSurname2(String Surname2) {
        this.Surname2 = Surname2;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPasword(String Pasword) {
        this.Pasword = Pasword;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public boolean isIsStudent() {
        return IsStudent;
    }

    public void setIsStudent(boolean IsStudent) {
        this.IsStudent = IsStudent;
    }

    public boolean isIsConected() {
        return IsConected;
    }

    public void setIsConected(boolean IsConected) {
        this.IsConected = IsConected;
    }

    
        
}