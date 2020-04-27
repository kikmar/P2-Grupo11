package UserSystem.Users;
import ForumSystem.PostContent.Content;
import UserSystem.Visitor;
import java.io.Serializable;
import java.util.LinkedList;
import ForumSystem.Notification;

public class User extends Visitor implements Serializable {
    private String Name;
    private String Surname1;
    private String Surname2;
    private String Nick;
    private String Email;
    private String Password;
    private boolean IsAdmin; 
    private boolean IsStudent;
    private boolean IsConected;
    private final LinkedList<Notification> notificationsContent = new LinkedList(); //Lo creo para notifications y como si fuera Listasubscriptiones en nuestro esquema
    
    private static final long serialVersionUID = 1L;
  //private Penalizacion Penalizado; fata crear clase Penalización

    public User() {                                //BOrrar desspues 
       // super(ID);                                // ///////////////////////////////////////////////
        this.Name = Name;
        this.Surname1 = Surname1;
        this.Surname2 = Surname2;
        this.Nick = Nick;
        this.Email = Email;
        this.Password = Password;
        this.IsAdmin = IsAdmin;
        this.IsStudent = IsStudent;
        this.IsConected = IsConected;
    }
    
    public User(String Name, String Surname1, String Surname2, String Nick, String Email, String Password, boolean IsAdmin, boolean IsStudent, boolean IsConected, int ID) {
        super(ID);
        this.Name = Name;
        this.Surname1 = Surname1;
        this.Surname2 = Surname2;
        this.Nick = Nick;
        this.Email = Email;
        this.Password = Password;
        this.IsAdmin = IsAdmin;
        this.IsStudent = IsStudent;
        this.IsConected = IsConected;
    }

    public String getName() {
        return Name;
    }

    public String getSurname1() {
        return Surname1;
    }

    public String getSurname2() {
        return Surname2;
    }

    public String getNick() {
        return Nick;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
    
    public boolean isIsAdmin() {
        return IsAdmin;
    }

    public boolean isIsStudent() {
        return IsStudent;
    }

    public boolean isIsConected() {
        return IsConected;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname1(String Surname1) {
        this.Surname1 = Surname1;
    }

    public void setSurname2(String Surname2) {
        this.Surname2 = Surname2;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setIsAdmin(boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public void setIsStudent(boolean IsStudent) {
        this.IsStudent = IsStudent;
    }

    public void setIsConected(boolean IsConected) {
        this.IsConected = IsConected;
    }

    public String toString(){
        return "Name: "+Name+" . Surname1: "+Surname1+" . Surname2: "+Surname2+
                " . Nick: "+ Nick+" . Password: "+ Password+" . Email: "+Email+
                " . IsAdmin: "+ IsAdmin+" . IsStudent: "+IsStudent+". IsLogged: "+ IsConected;
    
    }
    
    public void notificationAdd (String names, int read){
        notificationsContent.add(new Notification("names",read));
    }
    
     public void notificationRemove (String names){
        int x =0;
        Notification notification = new Notification();
         for (int i = 0; i < notificationsContent.size(); i++) {
             if (notification.getName().equals(names)) {
                  x = i;
                 
             }
         
         }
        notificationsContent.remove(x);
    }
        
}